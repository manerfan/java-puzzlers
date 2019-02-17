# Joy Of Hex

📃 [Java File](./JoyOfHex.java)  
🏠 [Home](../../../../../../../../README.md)

十六进制/八进制/二进制表示，自带符号  
Long类型的十六(八/二)进制与Int类型的十六(八/二)进制进行运算，会出现非预期效果

0x100000000L + 0xcafebabe = 0x0000_0001_0000_0000L + 0xffff_ffff_cafe_babeL

