pbList = []
class PhoneBook:
    def __init__(self, name, phoneNum, age):
        self.name = name
        self.phoneNum = phoneNum
        self.age = age 

def add():
    name = input("이름 입력: ")
    phoneNum = input("폰번호 입력: ")
    age = int(input("나이 입력: "))
    pb = PhoneBook(name, phoneNum, age)
    pbList.append(pb)
    print("==========================")
    for info in pbList:
        print(info.name, info.phoneNum, info.age)
    print("==========================")

def search():
    name = input("탐색할 이름 입력: ")
    for info in pbList:
        if info.name == name:
            print(info.phoneNum)

def delete():
    name = input("삭제할 이름 입력: ")
    for info in pbList:
        if info.name == name:
            pbList.remove(info)
    print("==========================")
    for info in pbList:
        print(info.name, info.phoneNum, info.age)
    print("==========================")

print("전화번호 관리 프로그램 시작...")
while True:
    print("1: 전화번호 추가, 2: 탐색, 3: 삭제, 4: 종료")
    menu = int(input())
    if menu == 1:
        add()
    elif menu == 2:
        search()
    elif menu == 3:
        delete()
    elif menu == 4:
        print("프로그램 종료")
        break
