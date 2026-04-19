package s6;

/* JADX INFO: loaded from: classes.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte[] f20068a = {55, 68, 111, 8, -55, 67, 47, 33, -28, 116, 61, 52, 81, 13, 124, 82, -97, 98, 42, 47, 28, 112, 82, 8, 48, -39, 27, 26, 8, -10, -116, 15};

    public static String a(String str) {
        return b(c(str));
    }

    public static String b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte[] bArr3 = f20068a;
            bArr2[i10] = (byte) (b10 ^ bArr3[i10 % bArr3.length]);
        }
        return new String(bArr2);
    }

    public static byte[] c(String str) {
        byte[] bArr = new byte[str.length() / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i10 + 1;
            byte bDigit = (byte) (Character.digit(str.charAt(i10), 16) << 4);
            bArr[i11] = bDigit;
            bArr[i11] = (byte) (bDigit + ((byte) Character.digit(str.charAt(i12), 16)));
            i11++;
            i10 = i12 + 1;
        }
        return bArr;
    }
}
