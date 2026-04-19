package x8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static float A(Parcel parcel, int i10) {
        M(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static int B(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder C(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + I);
        return strongBinder;
    }

    public static int D(Parcel parcel, int i10) {
        M(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer E(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        if (I == 0) {
            return null;
        }
        L(parcel, i10, I, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long F(Parcel parcel, int i10) {
        M(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long G(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        if (I == 0) {
            return null;
        }
        L(parcel, i10, I, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short H(Parcel parcel, int i10) {
        M(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int I(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void J(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + I(parcel, i10));
    }

    public static int K(Parcel parcel) {
        int iB = B(parcel);
        int I = I(parcel, iB);
        int iV = v(iB);
        int iDataPosition = parcel.dataPosition();
        if (iV != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iB))), parcel);
        }
        int i10 = I + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i10, parcel);
    }

    private static void L(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    private static void M(Parcel parcel, int i10, int i11) {
        int I = I(parcel, i10);
        if (I == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + I + " (0x" + Integer.toHexString(I) + ")", parcel);
    }

    public static BigDecimal a(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i11 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + I);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i11);
    }

    public static BigDecimal[] b(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i12] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + I);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + I);
        return new BigInteger(bArrCreateByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bigIntegerArr[i12] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + I);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + I);
        return zArrCreateBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + I);
        return bundle;
    }

    public static byte[] g(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + I);
        return bArrCreateByteArray;
    }

    public static byte[][] h(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + I);
        return bArr;
    }

    public static double[] i(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + I);
        return dArrCreateDoubleArray;
    }

    public static float[] j(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + I);
        return fArrCreateFloatArray;
    }

    public static int[] k(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + I);
        return iArrCreateIntArray;
    }

    public static long[] l(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + I);
        return jArrCreateLongArray;
    }

    public static Parcel m(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, I);
        parcel.setDataPosition(iDataPosition + I);
        return parcelObtain;
    }

    public static Parcel[] n(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = parcel.readInt();
            if (i13 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i13);
                parcelArr[i12] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i13);
            } else {
                parcelArr[i12] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + I);
        return parcelArr;
    }

    public static <T extends Parcelable> T o(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + I);
        return tCreateFromParcel;
    }

    public static String p(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + I);
        return string;
    }

    public static String[] q(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + I);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> r(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + I);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] s(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + I);
        return tArr;
    }

    public static <T> ArrayList<T> t(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int I = I(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + I);
        return arrayListCreateTypedArrayList;
    }

    public static void u(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    public static int v(int i10) {
        return (char) i10;
    }

    public static boolean w(Parcel parcel, int i10) {
        M(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean x(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        if (I == 0) {
            return null;
        }
        L(parcel, i10, I, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double y(Parcel parcel, int i10) {
        M(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double z(Parcel parcel, int i10) {
        int I = I(parcel, i10);
        if (I == 0) {
            return null;
        }
        L(parcel, i10, I, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
