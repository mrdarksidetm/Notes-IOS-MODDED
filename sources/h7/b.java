package h7;

import ae.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import je.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11862a = -8663945395140668459L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11863b = 5545529020109919103L;

    private final long b(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    private final long[] c(byte[] bArr, int i10, long j10) {
        long j11;
        int i11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        int i12;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        long jE = j10;
        long jF = jE;
        while (byteBufferWrap.remaining() >= 16) {
            long j23 = byteBufferWrap.getLong();
            long j24 = byteBufferWrap.getLong();
            long j25 = 5;
            jE = ((Long.rotateLeft(jE ^ e(j23), 27) + jF) * j25) + ((long) 1390208809);
            jF = ((Long.rotateLeft(jF ^ f(j24), 31) + jE) * j25) + ((long) 944331445);
        }
        byteBufferWrap.compact();
        byteBufferWrap.flip();
        if (byteBufferWrap.remaining() > 0) {
            long j26 = 0;
            switch (byteBufferWrap.remaining()) {
                case 1:
                    j11 = ((long) byteBufferWrap.get(0)) & 255;
                    j13 = j11 ^ 0;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 2:
                    i11 = 0;
                    j12 = ((((long) byteBufferWrap.get(1)) & 255) << 8) ^ 0;
                    j13 = j12 ^ (((long) byteBufferWrap.get(i11)) & 255);
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 3:
                    j12 = (((((long) byteBufferWrap.get(2)) & 255) << 16) ^ 0) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    i11 = 0;
                    j13 = j12 ^ (((long) byteBufferWrap.get(i11)) & 255);
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 4:
                    j14 = ((((long) byteBufferWrap.get(3)) & 255) << 24) ^ 0;
                    j13 = (((long) byteBufferWrap.get(0)) & 255) ^ ((j14 ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8));
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 5:
                    j15 = ((((long) byteBufferWrap.get(4)) & 255) << 32) ^ 0;
                    j14 = j15 ^ ((((long) byteBufferWrap.get(3)) & 255) << 24);
                    j13 = (((long) byteBufferWrap.get(0)) & 255) ^ ((j14 ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8));
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 6:
                    j16 = ((((long) byteBufferWrap.get(5)) & 255) << 40) ^ 0;
                    j15 = j16 ^ ((((long) byteBufferWrap.get(4)) & 255) << 32);
                    j14 = j15 ^ ((((long) byteBufferWrap.get(3)) & 255) << 24);
                    j13 = (((long) byteBufferWrap.get(0)) & 255) ^ ((j14 ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8));
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 7:
                    j16 = (((((long) byteBufferWrap.get(6)) & 255) << 48) ^ 0) ^ ((((long) byteBufferWrap.get(5)) & 255) << 40);
                    j15 = j16 ^ ((((long) byteBufferWrap.get(4)) & 255) << 32);
                    j14 = j15 ^ ((((long) byteBufferWrap.get(3)) & 255) << 24);
                    j13 = (((long) byteBufferWrap.get(0)) & 255) ^ ((j14 ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8));
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 8:
                    j11 = byteBufferWrap.getLong();
                    j13 = j11 ^ 0;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 9:
                    j17 = (((long) byteBufferWrap.get(8)) & 255) ^ 0;
                    j13 = byteBufferWrap.getLong() ^ 0;
                    j26 = j17;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 10:
                    i12 = 8;
                    j18 = ((((long) byteBufferWrap.get(9)) & 255) << 8) ^ 0;
                    j17 = j18 ^ (((long) byteBufferWrap.get(i12)) & 255);
                    j13 = byteBufferWrap.getLong() ^ 0;
                    j26 = j17;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 11:
                    j19 = ((((long) byteBufferWrap.get(10)) & 255) << 16) ^ 0;
                    i12 = 8;
                    j18 = j19 ^ ((((long) byteBufferWrap.get(9)) & 255) << 8);
                    j17 = j18 ^ (((long) byteBufferWrap.get(i12)) & 255);
                    j13 = byteBufferWrap.getLong() ^ 0;
                    j26 = j17;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 12:
                    j20 = ((((long) byteBufferWrap.get(11)) & 255) << 24) ^ 0;
                    j19 = j20 ^ ((((long) byteBufferWrap.get(10)) & 255) << 16);
                    i12 = 8;
                    j18 = j19 ^ ((((long) byteBufferWrap.get(9)) & 255) << 8);
                    j17 = j18 ^ (((long) byteBufferWrap.get(i12)) & 255);
                    j13 = byteBufferWrap.getLong() ^ 0;
                    j26 = j17;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 13:
                    j21 = ((((long) byteBufferWrap.get(12)) & 255) << 32) ^ 0;
                    j20 = j21 ^ ((((long) byteBufferWrap.get(11)) & 255) << 24);
                    j19 = j20 ^ ((((long) byteBufferWrap.get(10)) & 255) << 16);
                    i12 = 8;
                    j18 = j19 ^ ((((long) byteBufferWrap.get(9)) & 255) << 8);
                    j17 = j18 ^ (((long) byteBufferWrap.get(i12)) & 255);
                    j13 = byteBufferWrap.getLong() ^ 0;
                    j26 = j17;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 14:
                    j22 = ((((long) byteBufferWrap.get(13)) & 255) << 40) ^ 0;
                    j21 = j22 ^ ((((long) byteBufferWrap.get(12)) & 255) << 32);
                    j20 = j21 ^ ((((long) byteBufferWrap.get(11)) & 255) << 24);
                    j19 = j20 ^ ((((long) byteBufferWrap.get(10)) & 255) << 16);
                    i12 = 8;
                    j18 = j19 ^ ((((long) byteBufferWrap.get(9)) & 255) << 8);
                    j17 = j18 ^ (((long) byteBufferWrap.get(i12)) & 255);
                    j13 = byteBufferWrap.getLong() ^ 0;
                    j26 = j17;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                case 15:
                    j22 = (((((long) byteBufferWrap.get(14)) & 255) << 48) ^ 0) ^ ((((long) byteBufferWrap.get(13)) & 255) << 40);
                    j21 = j22 ^ ((((long) byteBufferWrap.get(12)) & 255) << 32);
                    j20 = j21 ^ ((((long) byteBufferWrap.get(11)) & 255) << 24);
                    j19 = j20 ^ ((((long) byteBufferWrap.get(10)) & 255) << 16);
                    i12 = 8;
                    j18 = j19 ^ ((((long) byteBufferWrap.get(9)) & 255) << 8);
                    j17 = j18 ^ (((long) byteBufferWrap.get(i12)) & 255);
                    j13 = byteBufferWrap.getLong() ^ 0;
                    j26 = j17;
                    jE ^= e(j13);
                    jF ^= f(j26);
                    break;
                default:
                    throw new AssertionError("Code should not reach here!");
            }
        }
        long j27 = i10;
        long j28 = jF ^ j27;
        long j29 = (jE ^ j27) + j28;
        long j30 = j28 + j29;
        long jB = b(j29);
        long jB2 = b(j30);
        long j31 = jB + jB2;
        return new long[]{j31, jB2 + j31};
    }

    static /* synthetic */ long[] d(b bVar, byte[] bArr, int i10, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j10 = 0;
        }
        return bVar.c(bArr, i10, j10);
    }

    private final long e(long j10) {
        return Long.rotateLeft(j10 * this.f11862a, 31) * this.f11863b;
    }

    private final long f(long j10) {
        return Long.rotateLeft(j10 * this.f11863b, 33) * this.f11862a;
    }

    @Override // h7.a
    public String a(String str) {
        r.f(str, "data");
        byte[] bytes = str.getBytes(d.f14195f);
        r.e(bytes, "this as java.lang.String).getBytes(charset)");
        long[] jArrD = d(this, bytes, str.length(), 0L, 4, null);
        StringBuilder sb2 = new StringBuilder();
        for (long j10 : jArrD) {
            sb2.append(Long.toHexString(j10));
        }
        String string = sb2.toString();
        r.e(string, "hashSb.toString()");
        return string;
    }
}
