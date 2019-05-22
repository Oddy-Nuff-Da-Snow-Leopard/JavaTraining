public class DataTypesTester {
	
	public static void testByte() {
		
		byte a = 5, b = 9, c = 0;
		
		System.out.println("\n***** BYTE TYPE OPERATORS *****");
		
		System.out.println("\n***** Arithmetical operators *****");
		// addition
		c = (byte)(a + b);
		System.out.printf("%d + %d = %d\n", a, b, c);
		// subtraction
		c = (byte)(a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);
		// multiplication
		c = (byte)(a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);
		// division
		c = (byte)(a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);
		// modulus
		c = (byte)(a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		
		try {
			c = (byte)(a / 0);
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c = (byte)(a % 0);
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		
		a = 5;
		// unary minus
		c = (byte)(-a);
		System.out.printf("-%d = %d\n", a, c);
		// unary plus
		c = (byte)(+a);
		System.out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 5;
		System.out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 5;
		System.out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 5;
		System.out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 5;
		System.out.printf("%d-- = %d\n", a, a--);
		
		
		a = 5;
		System.out.println("\n***** Relational operators *****");
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		
		
		System.out.println("\n***** Logical operators *****");
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		
		System.out.println("\n***** Bitwise(binary) operators *****");
		c = (byte)(a & b); // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte)(a | b); // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte)(a ^ b); // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte)(~a); // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n",
		String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
		String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'));

		c = (byte)(a << 1); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n",
		String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
		String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'));

		c = (byte)(a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n",
		String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
		String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'));

		a = -5;
		c = (byte)(a << 1); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n",
		String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
		String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'));
		
		c = (byte)(a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n",
		String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
		String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'));
		
		a = 5;
		c = (byte)(a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n",
		String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
		String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'));

		a = -5;
		c = (byte)(a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n",
		String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
		String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'));
		
		
		System.out.println("\n***** Assignment operator *****");
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		c = 7;
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		c = 7;
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		c = 7;
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		c = 7;
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		c = 7;
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		c = 7;
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		c = 7;
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = 7;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		c = 7;
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		c = 7;
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		
		System.out.println("\n***** Misc operator *****");
		System.out.println("\nCondition operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast operator:");
		short sh = -32000;
		char ch = '\u0041';
		int i = 100_500;
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		c = (byte)sh;
		System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
		
		c = (byte)ch;
		System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
		
		c = (byte)i;
		System.out.printf("byte = int: c = (byte)%d --> c = %d\n", i, c);
		
		c = (byte)l;
		System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);

		c = (byte)f;
		System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
		
		c = (byte)d;
		System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
		
		System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);
		
	}
	
	public static void testShort() {
		
		short a = 5, b = 9, c = 0;
		
		System.out.println("\n***** SHORT TYPE OPERATORS *****");
		
		System.out.println("\n***** Arithmetical operators *****");
		// addition
		c = (short)(a + b);
		System.out.printf("%d + %d = %d\n", a, b, c);
		// subtraction
		c = (short)(a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);
		// multiplication
		c = (short)(a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);
		// division
		c = (short)(a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);
		// modulus
		c = (short)(a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		
		try {
			c = (short)(a / 0);
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c = (short)(a % 0);
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		
		a = 5;
		// unary minus
		c = (short)(-a);
		System.out.printf("-%d = %d\n", a, c);
		// unary plus
		c = (short)(+a);
		System.out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 5;
		System.out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 5;
		System.out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 5;
		System.out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 5;
		System.out.printf("%d-- = %d\n", a, a--);
		
		
		a = 5;
		System.out.println("\n***** Relational operators *****");
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		
		
		System.out.println("\n***** Logical operators *****");
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		
		System.out.println("\n***** Bitwise(binary) operators *****");
		c = (short)(a & b); // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (short)(a | b); // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (short)(a ^ b); // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (short)(~a); // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));

		c = (short)(a << 1); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));
	
		c = (short)(a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));

		a = -5;
		c = (short)(a << 1); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));
		
		c = (short)(a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));
		                
		a = 5;
		c = (short)(a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));

		a = -5;
		c = (byte)(a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));
		
		
		System.out.println("\n***** Assignment operator *****");
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		c = 7;
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		c = 7;
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		c = 7;
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		c = 7;
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		c = 7;
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		c = 7;
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		c = 7;
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = 7;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		c = 7;
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		c = 7;
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		
		System.out.println("\n***** Misc operator *****");
		System.out.println("\nCondition operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast operator:");
		byte bt = -32;
		char ch = '\u0041';
		int i = 100_500;
		long l = 100_000_000_000L;
		float f = 1.9f;
		double d = 1234.625;
		boolean bool = true;
		
		c = bt;
		System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
		
		c = (short)ch;
		System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
		
		c = (short)i;
		System.out.printf("short = int: c = (short)%d --> c = %d\n", i, c);
		
		c = (short)l;
		System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);

		c = (short)f;
		System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
		
		c = (short)d;
		System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
		
		System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
		
	}
	
	public static void testChar() {
		
		char a = 'a', b = 'b', c;
		
		System.out.println("\n***** CHAR TYPE OPERATORS *****");
		
		System.out.println("\n***** Arithmetical operators *****");
		// addition
		c = (char)(a + b);
		System.out.printf("%c + %c = %c\n", a, b, c);
		// subtraction
		c = (char)(a - b);
		System.out.printf("%c - %c = %c\n", a, b, c);
		// multiplication
		c = (char)(a * b);
		System.out.printf("%c * %c = %c\n", a, b, c);
		// division
		c = (char)(a / b);
		System.out.printf("%c / %c = %c\n", a, b, c);
		// modulus
		c = (char)(a % b);
		System.out.printf("%c %% %c = %c\n", a, b, c);
		
		try {
			c = (char)(a / 0);
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c = (char)(a % 0);
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		
		a = 'a';
		// unary minus
		c = (char)(-a);
		System.out.printf("-%c = %c\n", a, c);
		// unary plus
		c = (char)(+a);
		System.out.printf("+%c = %c\n", a, c);
		// prefix increment
		a = 'a';
		System.out.printf("++%c = %c\n", a, ++a);
		// postfix increment
		a = 'a';
		System.out.printf("%c++ = %c\n", a, a++);
		// prefix decrement
		a = 'a';
		System.out.printf("--%c = %c\n", a, --a);
		// postfix decrement
		a = 'a';
		System.out.printf("%c-- = %c\n", a, a--);
		
		
		a = 'a';
		System.out.println("\n***** Relational operators *****");
		// equal to
		System.out.printf("%c == %c --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%c != %c --> %b\n", a, b, a != b);
		// greater than
		System.out.printf("%c > %c --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%c < %c --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
		
		
		System.out.println("\n***** Logical operators *****");
		// logical AND
		System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%c >= %c) ^ (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));
		
		
		System.out.println("\n***** Bitwise(binary) operators *****");
		c = (char)(a & b); // bitwise AND
		System.out.printf("%c & %c = %c\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (char)(a | b); // bitwise OR
		System.out.printf("%c | %c = %c\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (char)(a ^ b); // bitwise XOR
		System.out.printf("%c ^ %c = %c\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (char)(~a); // bitwise unary compliment
		System.out.printf("~%c = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));

		c = (char)(a << 1); // left shift
		System.out.printf("%c << 1 = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));

		c = (char)(a >> 1); // right shift
		System.out.printf("%c >> 1 = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));

		c = (char)(a >>> 1); // zero fill right shift
		System.out.printf("%c >>> 1 = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n",
		String.format("%16s", Integer.toBinaryString(a & 0xFFFF)).replace(' ', '0'),
		String.format("%16s", Integer.toBinaryString(c & 0xFFFF)).replace(' ', '0'));
		
		
		System.out.println("\n***** Assignment operator *****");
		c = 'c';
		System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
		c = 'c';
		System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
		c = 'c';
		System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
		c = 'c';
		System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
		c = 'c';
		System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		c = 'c';
		System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
		c = 'c';
		System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
		c = 'c';
		System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
		c = 'c';
		System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
		c = 'c';
		System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
		c = 'c';
		System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);
		
		
		System.out.println("\n***** Misc operator *****");
		System.out.println("\nCondition operator:");
		System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast operator:");
		byte bt = 3;
		short sh = -32000;
		int i = 100_500;
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		c = (char)bt;
		System.out.printf("char = bt: c = (char)%d --> c = %c\n", bt, c);
		
		c = (char)sh;
		System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
		
		c = (char)i;
		System.out.printf("char = int: c = (char)%d --> c = %c\n", i, c);
		
		c = (char)l;
		System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);

		c = (char)f;
		System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
		
		c = (char)d;
		System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c);
		
		System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool);
		
	}
	
	public static void testInt() {
		
		int a = 5, b = 9, c = 0;
		
		System.out.println("\n***** INT TYPE OPERATORS *****");
		
		System.out.println("\n***** Arithmetical operators *****");
		// addition
		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		// subtraction
		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);
		// multiplication
		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);
		// division
		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);
		// modulus
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		
		try {
			c = a / 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c = a % 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		
		a = 5;
		// unary minus
		c = -a;
		System.out.printf("-%d = %d\n", a, c);
		// unary plus
		c = +a;
		System.out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 5;
		System.out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 5;
		System.out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 5;
		System.out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 5;
		System.out.printf("%d-- = %d\n", a, a--);
		
		
		a = 5;
		System.out.println("\n***** Relational operators *****");
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		
		
		System.out.println("\n***** Logical operators *****");
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		
		System.out.println("\n***** Bitwise(binary) operators *****");
		c = a & b; // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a | b; // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a ^ b; // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));

		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
	
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		
		a = -5;
		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		                
		a = 5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));

		a = -5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		
		
		System.out.println("\n***** Assignment operator *****");
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		c = 7;
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		c = 7;
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		c = 7;
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		c = 7;
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		c = 7;
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		c = 7;
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		c = 7;
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = 7;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		c = 7;
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		c = 7;
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		
		System.out.println("\n***** Misc operator *****");
		System.out.println("\nCondition operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast operator:");
		byte bt = -32;
		short sh = 100;
		char ch = '\u0041';
		long l = 100_000_000_000L;
		float f = 1.9f;
		double d = 1234.625;
		boolean bool = true;
		
		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		
		c = (int)l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);

		c = (int)f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		
		c = (int)d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
		
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
		
	}
	
	public static void testLong() {
		
		long a = 5L, b = 9L, c = 0L;
		
		System.out.println("\n***** LONG TYPE OPERATORS *****");
		
		System.out.println("\n***** Arithmetical operators *****");
		// addition
		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		// subtraction
		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);
		// multiplication
		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);
		// division
		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);
		// modulus
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		
		try {
			c = a / 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c = a % 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		
		a = 5L;
		// unary minus
		c = -a;
		System.out.printf("-%d = %d\n", a, c);
		// unary plus
		c = +a;
		System.out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 5L;
		System.out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 5L;
		System.out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 5L;
		System.out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 5L;
		System.out.printf("%d-- = %d\n", a, a--);
		
		
		a = 5L;
		System.out.println("\n***** Relational operators *****");
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		
		
		System.out.println("\n***** Logical operators *****");
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		
		System.out.println("\n***** Bitwise(binary) operators *****");
		c = a & b; // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(b), Long.toBinaryString(c));

		c = a | b; // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(b), Long.toBinaryString(c));

		c = a ^ b; // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(b), Long.toBinaryString(c));

		c = ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(c));

		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(c));
	
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(c));
		
		a = -5L;
		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(c));
		
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(c));
		                
		a = 5L;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(c));

		a = -5L;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
		Long.toBinaryString(c));
		
		
		System.out.println("\n***** Assignment operator *****");
		c = 7L;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		c = 7L;
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		c = 7L;
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		c = 7L;
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		c = 7L;
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		try {
			c %= 0;
		} catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		c = 7L;
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		c = 7L;
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		c = 7L;
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = 7L;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		c = 7L;
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		c = 7L;
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		
		System.out.println("\n***** Misc operator *****");
		System.out.println("\nCondition operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast operator:");
		byte bt = -32;
		short sh = 100;
		char ch = '\u0041';
		int i = 4000000;
		float f = 1.9f;
		double d = 1234.625;
		boolean bool = true;
		
		c = bt;
		System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
		
		c = sh;
		System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
		
		c = ch;
		System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
		
		c = i;
		System.out.printf("long = int: c = %d --> c = %d\n", i, c);

		c = (long)f;
		System.out.printf("long = float: c = %f --> c = %d\n", f, c);
		
		c = (long)d;
		System.out.printf("long = double: c = %f --> c = %d\n", d, c);
		
		System.out.printf("long = boolean: c = %b --> Compile Error\n", bool);
	}
	
	public static void testFloat() {
		
		float a = 6.9F, b = 9.5F, c = 0.0F;
		
		System.out.println("\n***** FLOAT TYPE OPERATORS *****");
		
		System.out.println("\n***** Arithmetical operators *****");
		// addition
		c = a + b;
		System.out.printf("%f + %f = %f\n", a, b, c);
		// subtraction
		c = a - b;
		System.out.printf("%f - %f = %f\n", a, b, c);
		// multiplication
		c = a * b;
		System.out.printf("%f * %f = %f\n", a, b, c);
		// division
		c = a / b;
		System.out.printf("%f / %f = %f\n", a, b, c);
		// modulus
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a, b, c);
		// unary minus
		c = -a;
		System.out.printf("-%f = %f\n", a, c);
		// unary plus
		c = +a;
		System.out.printf("+%f = %f\n", a, c);
		// prefix increment
		a = 6.9F;
		System.out.printf("++%f = %f\n", a, ++a);
		// postfix increment
		a = 6.9F;
		System.out.printf("%f++ = %f\n", a, a++);
		// prefix decrement
		a = 6.9F;
		System.out.printf("--%f = %f\n", a, --a);
		// postfix decrement
		a = 6.9F;
		System.out.printf("%f-- = %f\n", a, a--);
		
		
		a = 6.9F;
		System.out.println("\n***** Relational operators *****");
		// equal to
		System.out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%f != %f --> %b\n", a, b, a != b);
		// greater than
		System.out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
		
		
		System.out.println("\n***** Logical operators *****");
		// logical AND
		System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
		
		
		System.out.println("\n***** Bitwise(binary) operators *****");
		System.out.println("Floating-point types has no bitwise operations!");
		
		
		System.out.println("\n***** Assignment operator *****");
		c = 10.9F;
		System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
		c = 10.9F;
		System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		c = 10.9F;
		System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		c = 10.9F;
		System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		c = 10.9F;
		System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
		
		
		System.out.println("\n***** Misc operator *****");
		
		System.out.println("\nCondition operator:");
		System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast operator:");
		byte bt = -32;
		short sh = 100;
		char ch = '\u0041';
		int i = 5;
		long l = 100_000_000_000L;
		double d = 1234.625;
		boolean bool = true;
		
		c = bt;
		System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
		
		c = sh;
		System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
		
		c = ch;
		System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
		
		c = i;
		System.out.printf("float = int: c = %d --> c = %f\n", i, c);

		c = l;
		System.out.printf("float = long: c = %d --> c = %f\n", l, c);
		
		c = (float)d;
		System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
		
		System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
	}
	
	public static void testDouble() {
		
		double a = 6.9, b = 9.5D, c = 0;
		
		System.out.println("\n***** DOUBLE TYPE OPERATORS *****");
		
		System.out.println("\n***** Arithmetical operators *****");
		// addition
		c = a + b;
		System.out.printf("%f + %f = %f\n", a, b, c);
		// subtraction
		c = a - b;
		System.out.printf("%f - %f = %f\n", a, b, c);
		// multiplication
		c = a * b;
		System.out.printf("%f * %f = %f\n", a, b, c);
		// division
		c = a / b;
		System.out.printf("%f / %f = %f\n", a, b, c);
		// modulus
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a, b, c);
		// unary minus
		c = -a;
		System.out.printf("-%f = %f\n", a, c);
		// unary plus
		c = +a;
		System.out.printf("+%f = %f\n", a, c);
		// prefix increment
		a = 6.9;
		System.out.printf("++%f = %f\n", a, ++a);
		// postfix increment
		a = 6.9;
		System.out.printf("%f++ = %f\n", a, a++);
		// prefix decrement
		a = 6.9;
		System.out.printf("--%f = %f\n", a, --a);
		// postfix decrement
		a = 6.9;
		System.out.printf("%f-- = %f\n", a, a--);
		
		
		a = 6.9;
		System.out.println("\n***** Relational operators *****");
		// equal to
		System.out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%f != %f --> %b\n", a, b, a != b);
		// greater than
		System.out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
		
		
		System.out.println("\n***** Logical operators *****");
		// logical AND
		System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
		
		
		System.out.println("\n***** Bitwise(binary) operators *****");
		System.out.println("Floating-point types has no bitwise operations!");
		
		
		System.out.println("\n***** Assignment operator *****");
		c = 10.9;
		System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
		c = 10.9;
		System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		c = 10.9;
		System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		c = 10.9;
		System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		c = 10.9;
		System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
		
		
		System.out.println("\n***** Misc operator *****");
		
		System.out.println("\nCondition operator:");
		System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast operator:");
		byte bt = -32;
		short sh = 100;
		char ch = '\u0041';
		int i = 5;
		long l = 100_000_000_000L;
		float f = 1234.625F;
		boolean bool = true;
		
		c = bt;
		System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
		
		c = sh;
		System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
		
		c = ch;
		System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
		
		c = i;
		System.out.printf("double = int: c = %d --> c = %f\n", i, c);

		c = l;
		System.out.printf("double = long: c = %d --> c = %f\n", l, c);
		
		c = f;
		System.out.printf("double = double: c = %f --> c = %f\n", f, c);
		
		System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool);
		
	}
	
	public static void testBoolean() {
		
		boolean a = true, b = false, c;
		
		System.out.println("\n***** BOOLEAN TYPE OPERATORS *****");
		
		System.out.println("\n***** Arithmetical operators *****");
		System.out.println("Boolean type has no arithmetic operators defined!");


		System.out.println("\n***** Relational operators *****");
		// equal to
		System.out.printf("%b == %b --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%b != %b --> %b\n", a, b, a != b);
		System.out.println("Boolean variables can only be compared to equality and inequality");
		
		
		System.out.println("\n***** Logical operators *****");
		c = a && b; // logical AND
		System.out.printf("%b && %b = %b\n", a, b, c);
		c = a || b; // logical OR
		System.out.printf("%b || %b = %b\n", a, b, c);
		c = a ^ b; // logical XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		// logical NOT
		System.out.printf("!%b --> %b\n", a, !a);
		
		
		System.out.println("\n***** Bitwise(binary) operators *****");
		c = a & b; // bitwise AND
		System.out.printf("%b & %b = %b\n", a, b, c);
		c = a | b; // bitwise OR
		System.out.printf("%b | %b = %b\n", a, b, c);
		c = a ^ b; // bitwise XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		System.out.println("Boolean type has no unary compliment,\nleft and right shifts and also zero fill right shift!");

		
		System.out.println("\n***** Assignment operator *****");
		System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
		System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
		System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
		
		
		System.out.println("\n***** Misc operator *****");
		System.out.println("\nCondition operator:");
		System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));

		System.out.println("\nType Cast operator:");
		System.out.println("A value of type boolean cannot be converted to any type, nor is it cannot be obtained from any type!");
	}
}