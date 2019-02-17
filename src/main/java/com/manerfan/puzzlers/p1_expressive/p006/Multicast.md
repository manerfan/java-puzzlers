# Multicast

🏠 [Home](../../../../../../../../README.md)

-1在各类型下的十六进制表示  
- (byte) -1  = signed   0xf  
- (char) -1  = unsigned 0xffff
- (short) -1 = signed   0xffff  
- (int) -1   = signed   0xffff_ffff

byte(signed) -> char(unsigned):  
(char) (byte) -1 = signed -> unsigned 0xffff

char(unsigned) -> int(signed):  
(int) (char) (byte) -1 = unsigned -> signed 0x0000_ffff

char(unsigned) -> short(signed):  
(short) (char) (byte) -1 = unsigned -> signed 0xffff

short(signed) -> int(signed):  
(int) (short) (char) (byte) -1 = unsigned -> signed 0xffff_ffff

