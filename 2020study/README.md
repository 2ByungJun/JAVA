## 5. 대용량 데이터를 읽거나 쓸때는 신중해야 한다. (binary serialization for big data I/O)

### 1) ByteBuffer 클래스의 directAllocate를 사용할때는 신중해야 한다. 

- heap allocate보다 부하가 크다(약25배). 오랫동안 유지할만곳 (예를 들면 채널)에서 이용한다. 큰 배열 데이터에 대해서 사용하는 것이 좋다.



### 2) NIO써라. IO Stream 계열 클래스들은 느리다.

 - read/write에 대해 synchronisation을 보장한다. 그래서 느리다.

- 장점은 메시지 사이즈를 몰라도 사용할수 있다는 것.

- IO Stream class들 (ByteArrayOutputStream,ByteArrayIputStream,

  DataInputStream, DataArrayInputStream, DataOutputStream,DataArrayOutputStream,

  OutputStreamWriter, BufferedReader, BufferedWriter..etc)



-  보낼 사이즈를 알고 있는 경우에는  ByteBuffer써라.

- ByteBuffer의 put/get계열 함수들은 thread safe하지 않다. 그리고 멀티스레드 용도로 디자인되지도 않았다. 생성 이후의 operation은 빠르다.



### 3) 대단위 데이터 입출력을 위해서는 ByteBuffer의 bulk method를 이용할것

- IO Stream 게열들의 클래스는 read/write에 대해서 thread safe하다. 느리다는 얘기

- array  데이터가 있을때 (byte이던 long이던) 실제 ByteBuffer에 put하거나 get할때 loop를 사용하지 말것.

- 데이터 형태와 사이즈를 기록하는 bulk 메소드를 이용할것

```
예) long형

final int ARRAY_LENGTH  = 500

final ByteBuffer buf = ByteBuffer.allocateDirect(ARRAY_LENGTH * 8  + 20).order( ByteOrder.LITTLE_ENDIAN );

long[] data = new long[ARRAY_LENGTH];

buf.putInt(data.length);

buf.asLongBuffer().put(data)

buf.position( buf.position() + data.length * 8)
```

```
예) byte형

final int ARRAY_LENGTH  = 500

final ByteBuffer buf = ByteBuffer.allocate(ARRAY_LENGTH + 20).order( ByteOrder. LITTLE_ENDIAN );

byte[] data = new byte[ARRAY_LENGTH];

buf.putInt( data.length );

buf.put( data );
```


### 6. JDK Collection Framework 잘쓰기

> 6.1) List (대표 인터페이스)

- for문안에서 iterate할수 있다.



>> 6.1.1) ArrayList (not thread safe )

- 제일 많이 쓴다. 

- 속도를 위해 항상 마지막에 element 추가하거나 삭제할것. 

- 가능하면 크기를 예측하고 생성할것.

- contains사용하지 말것, indexOf사용하지 말것. 

- 중간 element 삭제하지말고 null처리 할것. removeAll사용말것것

- ist의 null부분을 정리하기 위해 subList(int,int).clean() 패턴을 사용할것..

>> 6.1.2) LinkedList (not thread safe )

- 느리니까 쓰지 말것

- queue의 용도라면 ArrayDeque 사용

- ListIterator를 사용할것. 

- 중간 엘리먼트 접근하지 말것.



>> 6.1.3) CopyOnWriteArrayList (concurrent)

- 리스트에 업데이트나면 복사본 만든다. 

- 업데이트가 자주 발생하지 않는 상황에서 사용할것.







> 6.2) Queue / Deques  (대표 인터페이스)

- FIFO or LIFO, queue는 멀티 스레딩 환경에서 필수적인 자료구조이기에 다양한 queue들이 존재한다.



>> 6.2.1) ArrayDeque (not thread safe )

- Double Ended Queue: 양쪽 끝에서 추가/삭제 가능하다. (Stack + Queue)

- ArrayList와 다르게 중간 element를 맘대로 접근할수 없다. LinkedList보다 빠름.



>> 6.2.2) Stack (not thread safe )

=> LIFO. 그냥 사용하지 말고 ArrayDeque사용할것.



>> 6.2.3) PriorityQueue (not thread safe )

- 우선순위 heap 구조에 기반한 큐. 기본적으로 FIFO지만 우선순위에 따른다.

- (같은 우선순위라면 peek이나 remove시에 먼저 들어온 놈이 먼저 나감)



>> 6.2.4) ArrayBlockingQueue  (concurrent)

- 고정 길이 배열 기반한 FIFO queue.



>> 6.2.5) LinkedBlockingQueue  (concurrent)

- 가변 길이 배열 기반한 FIFO queue



>> 6.2.6) PriorityBlockingQueue  (concurrent)

- PriorityQueue의 동기화버전이다.



>> 6.2.7) SynchronousQueue  (concurrent)

- 데이터를 위한 내부공간이 없는 queue이다. thread간의 이벤트 소비에 사용된다.

- 생성자 thread의 insert와 소비자 thread의 remove함수가 동시에 수행된다.

- 생성자 소비자 패턴에 적합하다. peek()등의 함수도 없다.



>> 6.2.8) ConcurrentLinkedQueue  (concurrent)
- 가변길이 양쪽 끝에서 추가/삭제 가능한 queue

>> 6.2.9) DelayQueue  (concurrent)
- 우선수위 heap기반. 입력순서와 상관없이, queue에 어느 시점에 들어갈지를 시간으로 지정할수 있다. 
- 입력시점이 우선순위라면 우선순위로 queue가 구성될것이다

>> 6.2.10) LinkedTransferQueue  (concurrent)
- 가변길이, FIFO, 보내는 쪽은 transfer(), 받는 쪽은 take()라는 함수를 사용한다. 
- 전송이 되어야지만 함수가 리턴된다.




> 6.3) Map  (대표 인터페이스)

: containsKey+get 이런거 최대한 하지 말고 일단 get하고 null체크할것. 속도가 빨라진다. remove도 마찬가지.



>> 6.3.1) HashMap (not thread safe )

- primitive는 key및 value로 받을수 없다는 단점을 가지고 있다. null허용된다.



>> 6.3.2) EnumMap (not thread safe )

- Key에 Enum 사용할때, 확실하게 어떤 enum형을 사용할지 명시할수 있다.

```
예)
Map<Calendar,Object> calendarMap = new EnumMap<Calendar,Object>(Calendar.class);
```


>> 6.3.3) Hashtable (concurrent)

- 동기화되는 HashMap. deprecated되었다.



>> 6.3.4) IdentityHashMap (not thread safe )

- HashMap이 객체의 equal()/hashcode()를 사용해 key를 계산한다면, 

- IdentityHashMap 은 객체자체의 reference를 가지고 비교한다. 

- 같은 조건이라면 identiryHashMap의 갯수가 일반 HashMap보다 소유객체가 많고, 속도도 빠르다.

- iterate할때마다 결과다르다.

```
   IdentityHashMap<String, String> identityMap = new IdentityHashMap<String, String>();

   identityMap.put("sony", "bravia");

   identityMap.put(new String("sony"), "mobile");  

   System.out.println("Size of IdentityHashMap: " + identityMap.size()); => 2개(만약 일반 HashMap이라면 1개)
```
            

>> 6.3.5) LinkedHashMap (not thread safe )

- 정렬된 HashMap이다. 입력된 순서를 기준으로 연결되어있다. 

- keySet()혹은 entrySet()함수를 부르면 key에 따라 정렬된 배열이 리턴된다.



>> 6.3.6) TreeMap (not thread safe )

- LinkedHashMap과 비슷하지만 사용자가 comparator를 사용해 직접 어떤 값에 대해 비교를 할지 정할수 있다.



>> 6.3.7) WeakHashMap (not thread safe )

- GC에 의해 삭제될수 있는 키/객체쌍.  주로 캐싱에서 많이 사용한다. 

- 만약 값이 없으면 새로 생성해서 다시 키와 연결하는 패턴으로 사용



>> 6.3.8) ConcurrentHashMap (concurrent)

- ConcurrentMap의 구현체. HashMap의 동기화버전이다. interator를 실제 객체가 아닌 복사본 반환.

- ConcurrentMap.size()함수는 정확하지 않을수 있다. 

- 반환하기 때문에   ConcurrentModificationException도 발생하지 않는다

- Fast-Fail 하지 않다고 할수 있으며, 대신 Fail-safe하다고 할수 있다.

 

>> 6.3.2) ConcurrentSkipListMap (concurrent)

- ConcurrentNavigableMap의 구현체.Skip List 자료구조에 기반한 Map이다. 

- key에 따라 정렬되는 자료구조. Comparator를 통해 정렬순서를 정할수 있다.





> 6.4) Set (대표 인터페이스)

: Set의 구조들은 상당부분 Map과 비슷하다. for문안에서 iterate할수있다. contains + add,remove 는 그냥 add, remove로 처리하고 후속 조치 할것.



>> 6.4.1) HashSet  (not thread safe )

- primitive는 key및 받을수 없다. null허용된다.



>> 6.4.2) EnumSet (not thread safe )

- 전체 Enum값중에 일부를 가지고 Set을 만들수 있다. 

  예) Set<Calendar> weekSet = EnumSet.of(Calendar.MONDAY,Calendar.TUESDAY);



>> 6.4.3) BitSet (not thread safe )

- 전체 Bit가 N개 있다고 가정하고 메모리 공간을만든후, 

- 정렬을 원하는 값을 index로 보고 set(index)을 사용해 값을 true로 변경한다. bit처리를 할때 좋다(OR,AND,XOR).

- 가능하면 애용할것.

 

>> 6.4.4) LinkedHashSet (not thread safe )

- 입력 순서를 기억하는 Set이다. 



>> 6.4.5) TreeSet (not thread safe )

- 정렬이 가능한 Set이다. comparator도 사용가능하다.



>> 6.4.6) ConcurrentSkipListSet (concurrent)

- TreeSet의 동기화버전



>> 6.4.7) CopyOnWriteArraySet (concurrent)

- 리스트에 업데이트나면 복사본 만든다. 

- 업데이트가 자주 발생하지 않는 상황에서 사용할것.

                   



### 7. Regular Expression관련

1) String의 matches, split, replaceAll, replaceFirst를 사용하지 말고 대신

Pattern,Matcher class를 사용할것. compile시간을 줄인다.



2) Regexp가 아닌 1개 character에 대한 split은 string.split()이 가장 빠르다. (java 7)



3) 왠만하면 Regexp쓰지말고 수작업 parsing코드 사용할것.





### 8. java.util.Date 관련

1) 왠만하면 long쓸것. 정말 꼭 필요한 마지막 순간에 Date로 변환할것.

2) java.util.Calendar도 왠만하면 쓰지 말것.

3) joda time library가 어떤 경우에서는 더 빠르다. time critical한 상황이라면 JDK와 적당히 섞어 쓸것.



### 9. Checksum

java.util.zip.CRC32는 느림.  java.util.zip.Adler32사용할것. 확인시에는 똑같이 java.util.zip.Checksum사용.



### 10. hashCode 튜닝

HashMap과 HashSet이 키 비교에 사용하는 hashCode는 잘 분산시키는 것이 중요하다. 절대 hashCode()가 상수를 리턴해서는 안된다.

String의 hashCode()는 매우 구현이 잘되어있으므로, 만든클래스에서 unique한 스트링이 있으면 해시코드로 사용하는 것이 좋다.



### 11. Exception을 항시 던지는 것은 미친짓이다.

Exception을 함수의 리턴 코드대신 던지는 것은 해서는 안될 일이다.



### 12. Logging

1) logging framework을 써라

2) 객체를 그대로 찍어라. 그리고 그 객체안에 toString()함수를 구현해라.

3) 로깅 함수 argument로 Object.toStrong()를 사용하지 말것

[출처] Java 어플리케이션 튜닝 - 적절한 API 사용법|작성자 IDEO