package ByteShortIntLong;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;

	System.out.println("Integer minimum value = "+myMinIntValue);
	System.out.println("Integer maximum value = "+myMaxIntValue);

	System.out.println("Busted MAX value = " + (myMaxIntValue+1));
	System.out.println("Busted MIN value = " + (myMinIntValue-1));

	int myMaxIntTest = 2_147_483_647;

	byte myMinByteValue = Byte.MIN_VALUE;
	byte myMaxByteValue = Byte.MAX_VALUE;

	System.out.println("Byte minimum value = "+myMinByteValue);
	System.out.println("Byte maximum value = "+myMaxByteValue);

	short myMinShortValue = Short.MIN_VALUE;
	short myMaxShortValue = Short.MAX_VALUE;
	System.out.println("Short minimum value = "+myMinShortValue);
	System.out.println("Short maximum value = "+myMaxShortValue);

	long myLongValue = 100;
	long myMinLongValue = Long.MIN_VALUE;
	long myMaxLongValue = Long.MAX_VALUE;
	System.out.println("Long minimum value = "+myMinLongValue);
	System.out.println("Long maximum value = "+myMaxLongValue);

	long bigLongLiteralValue = 2_147_483_647_234L;
	System.out.println("Testing big long literal value: "+bigLongLiteralValue);

	short bigShortLiteralValue = 32767;

	int myTotal = (myMinIntValue/2);
	byte myNewByteValue = (byte) (myMinByteValue/2);

	short myNewShortValue = (short) (myMinShortValue / 2);

	byte byteChallenge = 10;
	short shortChallenge = 20;
	int intChallenge = 50;
	long longChallenge = 50000L + 10L * (byteChallenge+shortChallenge+intChallenge);
	System.out.println(longChallenge);

	short shortTotal = (short) (1000 + 10 * (byteChallenge + shortChallenge + intChallenge));

    }
}
