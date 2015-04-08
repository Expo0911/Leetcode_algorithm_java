class TwoSum:
    # @return a tuple, (index1, index2)
    def twoSum(self, num, target):
        dic = {}
        for i in range(len(num)):
            if target-num[i] in dic:
                return dic[target-num[i]], i+1
            else:
                dic[num[i]] = i+1
        return -1,-1

def main():
    test = [2, 7, 11, 15]
    ans = TwoSum().twoSum(test, 9)
    print ans

if __name__ == '__main__':
    main()