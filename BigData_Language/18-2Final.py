'''
2018학년  2학기 기말고사
다른  부분은 절대 수정하지말고 각 사용자 정의함수
몸체에 코드를 작성하시오.
'''
import random

class Student :
    def __init__(self, name, age):
        self.name = name
        self.age = age

list1 = [3, 5, 7, 9, 11]
list2 = []
contacts = dict()

def test1(L): # list1 평균 반환
   return sum(list1) / len(list1)

def test2(): #8자리, 알파벳과 숫자 조합의 암호 생성 반환
    keyboard = "abcdefghijklmnopqrstuvwxyz0123456789"
    password = ""
    for i in range(8):
        random_number = random.randint(0, len(keyboard) - 1)
        password += keyboard[random_number]
    return password

def test3(s): # 회문 판단 프로그램. 회문이면 True 아니면, False 반환
    for i in range(len(s) // 2):
        if s[i] != s[len(s) - i - 1]:
            return False
            break
    return True

# 전달된 이름과, 나이 정보를 가지고 Student 객체 생성 및 list2에 삽입
def test4_insertStudentInfo(name, age):
    student = Student(name, age)
    list2.append(student)

# 전달된 이름을 가지고 list2에서 검색해서 반드시 아래와 같이 출력
# [이순신, 45]
def test5_searchStudentInfo(s):
    return print(*[[info.name, info.age] for info in list2 if info.name == s])

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
        

# 메인 프로그램 시작...
print(test1(list1))
print(test2())
Msg = input("문자열 입력: ")
if test3(Msg) :
    print("회문...")
else:
    print("회문이 아님...")
test4_insertStudentInfo("유관순", 16)
test4_insertStudentInfo("이순신", 45)
test5_searchStudentInfo("이순신")

test6_insertDic()
print(contacts)