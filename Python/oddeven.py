n = input()

oddsum=0
evensum=0

for i in range(len(n)):
	if (i+1) % 2 == 0 :
		evensum = evensum + int(n[i])
	else:
		oddsum = oddsum + int(n[i])

print(abs(oddsum-evensum)) 