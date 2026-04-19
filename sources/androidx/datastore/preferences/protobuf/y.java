package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f3779a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f3780b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f3781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f3782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.h f3783e;

    public interface a extends i<Boolean> {
    }

    public interface b extends i<Double> {
    }

    public interface c {
        int d();
    }

    public interface d<T extends c> {
        T a(int i10);
    }

    public interface e {
        boolean a(int i10);
    }

    public interface f extends i<Float> {
    }

    public interface g extends i<Integer> {
    }

    public interface h extends i<Long> {
    }

    public interface i<E> extends List<E>, RandomAccess {
        void e();

        i<E> g(int i10);

        boolean p();
    }

    static {
        byte[] bArr = new byte[0];
        f3781c = bArr;
        f3782d = ByteBuffer.wrap(bArr);
        f3783e = androidx.datastore.preferences.protobuf.h.h(bArr);
    }

    static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return j1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((n0) obj).c().l((n0) obj2).y();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f3779a);
    }
}
