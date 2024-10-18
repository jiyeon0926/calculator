# ⭐ 구현 STEP
- Lv 1. 클래스 없이 계산기 구현
- Lv 2. 클래스를 활용한 계산기 구현
- Lv 3. Enum, 제네릭, 람다, 스트림을 적용한 계산기 구현


# 📌 구현할 때 지킬 것
- 디렉토리 및 파일의 적절한 분리
- 변수명 등 코드를 직관적이고 이해하기 쉽게 작성
- 주석을 활용해 코드를 설명
- 특수 상황에 대한 예외 처리
- 커밋 컨벤션을 지킨 커밋


# 📝 참고
- https://udacity.github.io/git-styleguide/ (커밋 컨벤션)
- https://velog.io/@shin6403/Git-git-%EC%BB%A4%EB%B0%8B-%EC%BB%A8%EB%B2%A4%EC%85%98-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0 (커밋 컨벤션)
- https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%97%B4%EA%B1%B0%ED%98%95Enum-%ED%83%80%EC%9E%85-%EB%AC%B8%EB%B2%95-%ED%99%9C%EC%9A%A9-%EC%A0%95%EB%A6%AC (Enum)
- https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%A0%9C%EB%84%A4%EB%A6%ADGenerics-%EA%B0%9C%EB%85%90-%EB%AC%B8%EB%B2%95-%EC%A0%95%EB%B3%B5%ED%95%98%EA%B8%B0 (Generic)
- https://jihoon2723.tistory.com/entry/JAVA-%EC%A0%9C%EB%84%A4%EB%A6%ADGeneric%EC%9D%B4%EB%9E%80 (Generic)
- https://velog.io/@yeoni9094/%EB%82%B4%EC%9D%BC%EB%B0%B0%EC%9B%80%EC%BA%A0%ED%94%84-%EB%AA%A8%EB%8D%98-%EC%9E%90%EB%B0%94-20241016 (람다와 스트림 내용 복습)
- https://velog.io/@persestitan/Java-%EC%B5%9C%EB%8C%80%EA%B0%92-%EC%B5%9C%EC%86%8C%EA%B0%92-%EA%B5%AC%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95 (스트림을 사용해 최댓값 구하기)
-------------


# 1️⃣ Lv 1. 클래스 없이 계산기 구현

### 📋 요구사항
- 양의 정수(0 포함)를 입력받기
- 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
- 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
- 반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기

### ✅ 체크
- 정수로 입력 받는지? Y
- 사칙연산 기호를 입력 받는지? Y
- 입력받은 정수와 기호를 통해 연산이 가능한지? Y
- 연산 결과값 출력이 가능한지? Y
- 반복문을 사용했는지? Y
- "exit"를 입력하기 전까지 무한으로 계산할 수 있는지? Y
- "exit"를 입력하면 반복문 종료가 되는지? Y
---------------


# 2️⃣ Lv 2. 클래스를 활용한 계산기 구현

### 📋 요구사항
- 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
- Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정
- App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
- Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정

### ✅ 체크
- 사용한 컬렉션은? ArrayList
- 사칙연산을 수행하는가? Y
- 연산 결과값을 저장하는가? Y
- App 클래스에서 직접 연산하지 않고, Calculator 클래스의 메서드를 통해 연산하는가? Y
- Calculator 클래스에 getter 메서드를 구현하였는가? Y
- Calculator 클래스에 setter 메서드를 구현하였는가? Y
- App 클래스의 main 메서드에서 Calculator 클래스의 getter 메서드로 접근해 연산 결과값을 가져오는가? Y
- App 클래스의 main 메서드에서 Calculator 클래스의 setter 메서드로 접근해 연산 결과값을 수정하는가? Y
- 계속 연산할 때마다 결과값을 저장하는가? Y
- Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현하였는가? Y
- App 클래스의 main 메서드에서 Calculator 클래스의 remove 메서드로 접근해 가장 먼저 저장된 데이터를 삭제하는가? Y
--------


# 3️⃣ Lv 3. Enum, 제네릭, 람다, 스트림을 적용한 계산기 구현

### 📋 요구사항
- 현재 사칙연산 계산기는 (➕,➖,✖️,➗) 이렇게 총 4가지 연산 타입으로 구성
- 실수, 즉 double 타입의 값을 전달 받아도 연산이 수행하도록 만들기
- 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력

### 📚 사전 지식

#### 💡 Enum
- 상수만을 다루는 enum 클래스
- 객체
- 정수로 매핑
- enum 키워드를 사용하기 때문에 구현의 의도가 열거인 것을 알 수 있음
- 자체 클래스 상수와 달리 switch 문 사용 가능
- enum에서 한 번에 관리하기 때문에 enum 코드 외에서 수정할 필요 없음
- enum 명은 첫 문자를 대문자로 작성, 나머지는 소문자로 구성
- 열거 상수는 모두 대문자로 작성
- 열거 상수가 여러 문자로 구성된 경우에는 단어 사이에 "_" 사용

#### 💡 Generic
- 클래스 내부에서 사용할 데이터 타입을 외부에서 지정
- <> 안에 타입 기재

### 💥 트러블 슈팅
- https://velog.io/@yeoni9094/%EB%AC%B8%EC%A0%9C%ED%95%B4%EA%B2%B0-Lv.-3-%EA%B3%84%EC%82%B0%EA%B8%B0-Trouble-Shooting-20241016
