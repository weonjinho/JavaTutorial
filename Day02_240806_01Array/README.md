# CPU, RAM, 보조기억장치
    CPU(중앙처리장치) : RAM에서 가져온 데이터를 연산 처리하는 곳이다. 
    보조기억장치:전원이 꺼져도 데이터가 사라지지않는 기억장치.
    메모리(주기억장치):전원이 꺼지면 데이터가 사라진다.

# 데이터 저장 기간:
    보조기억장치: 영구적
    메모리(RAM): 임시기억

# RAM 성능이 중요한 이유:  
    가져올 데이터가 많아서 RAM 성능이 좋아야한다.
    int : 주기억장치 메모리를 4byte 차지한다.

# 연산자
    단항연산자(a++), 이항연산자(a+b)를 먼저 분리한다.

### 단항 연산자 : 피연산자가 1개인 연산자.
    -종류:  
    단항 연산자: ++, --, +, - (양의정수, 음의정수)   
    ---> 예제: ++a, a++, --b, b--, +c, -c  

### 이항 연산자: 피연산자가 2개인 연산자.
    -종류:  
        1. 산술 연산자: ( +  -  *  /   % )  
        2. 문자열 연결 연산자: +  
        3. 비교 연산자: ( ==  !=  >=  <=  >  < )  
        4. 논리 연산자: ( &&   ||  &  |  ^  ! )  
        5. 비트 논리 연산자: ( &  |  ^ )  
        6. 대입 연산자: ( =  +=  -=  *= )  

### 연산자 우선순위 : 
    단항 > 이항(산술,비교,대입)  

# 배열
    -배열 선언: 
        자료형[] 변수명 = new 자료형[배열길이];  
	
    -장점: 
        변수를 하나로 사용해서 여러개의 값을 저장할 수 있다. 
	 
    -특징 : 
        1. 고정길이.  
        2. 연속적으로 값을 할당.  


