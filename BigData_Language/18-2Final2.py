'''
2018학년  2학기 기말고사
다른  부분은 절대 수정하지말고 각 사용자 정의함수
몸체에 코드를 작성하시오.
'''
class Student :
    def __init__(self, name, age, score):
        self.name = name
        self.age = age
        self.score = score

simpleList = [1,2,3,4,5]
StudentList = []
contacts = dict()

# 4자리의 정수를 전달 받아서 자리수의 합을 계산해서 반환하는 test1 함수 완성
# 예를 들어서 사용자가 1234를 입력하면 1+2+3+4를 계산 및 반환
def test1(n):
    return sum([int(i) for i in list(str(n)) if len(str(n)) == 4])

# 중첩 반복문을 활용하여 아래와 같이 출력하는 test2 함수 완성
'''
xxx1
xx123
x12345
1234567
'''

def test2():
    for i in range(4):
        print("x" * (3 - i) + "".join([str(n) for n in range(1, 2 * i + 2)]))
# 위의 simpleList에서 최대값과, 최소값을 반환하는 아래의 함수 완성
def test3():
    return max(simpleList), min(simpleList)
# 전달된 이름과, 나이, 점수 정보를 가지고 Student 객체 생성 및 StudentList에 삽입하는 함수 완성
def test4_insertStudentInfo(name, age, score):
    student = Student(name, age, score)
    StudentList.append(student)

# StudentList에서 최고 점수(score)를 받은 사람의 이름을 반환하는 아래 함수 완성
def test5():
    return "".join([info.name for info in StudentList if max(info.score for info in StudentList) == info.score])

''' 아래와 같이 엔터를 입력할 때까지 이름(key)과 전화번호(value)를 
입력받아서 위의 contacts에 저장하는 함수 완성
## 아래 ##
이름을 입력하시오: 홍길동
전화번호를 입력하시오: 111-2222
이름을 입력하시오: 김철수
전화번호를 입력하시오: 222-3333
이름을 입력하시오: 엔터
'''
def test6_insertDic():
     while True:
        name = input("이름을 입력하시오: ")
        if name == "":
            break
        phonenumber = input("전화번호를 입력하시오: ")
        contacts[name] = phonenumber

# 메인 프로그램 시작
num = int(input("4자리 정수 입력: "))
print("자리수의 합: ", test1(num))
test2()
print("최대 및 최소값은", test3())
test4_insertStudentInfo("유관순", 16, 88)
test4_insertStudentInfo("이순신", 45, 95)
test4_insertStudentInfo("김유신", 55, 85)
print("최고점자: ", test5())

test6_insertDic()
print(contacts)
