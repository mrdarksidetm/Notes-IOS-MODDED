package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import com.google.android.gms.common.api.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static SimpleDateFormat U;
    private static SimpleDateFormat V;
    private static final e[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final e[] f3875a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final e[] f3876b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final e[] f3877c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final e[] f3878d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final e f3879e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final e[] f3880f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final e[] f3881g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final e[] f3882h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final e[] f3883i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final e[][] f3884j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final e[] f3885k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final HashMap<Integer, e>[] f3886l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashMap<String, e>[] f3887m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashSet<String> f3888n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f3889o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final Charset f3890p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final byte[] f3891q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final byte[] f3892r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f3893s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f3894t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f3895u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f3897v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f3903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f3904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f3907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<Integer> f3908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f3909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f3911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f3912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f3913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f3914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f3915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f3918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f3920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3921t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f3922u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f3896v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List<Integer> f3898w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List<Integer> f3899x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f3900y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f3901z = {4};
    public static final int[] A = {8};
    static final byte[] B = {-1, -40, -1};
    private static final byte[] C = {102, 116, 121, 112};
    private static final byte[] D = {109, 105, 102, 49};
    private static final byte[] E = {104, 101, 105, 99};
    private static final byte[] F = {79, 76, 89, 77, 80, 0};
    private static final byte[] G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] H = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] I = {101, 88, 73, 102};
    private static final byte[] J = {73, 72, 68, 82};
    private static final byte[] K = {73, 69, 78, 68};
    private static final byte[] L = {82, 73, 70, 70};
    private static final byte[] M = {87, 69, 66, 80};
    private static final byte[] N = {69, 88, 73, 70};
    private static final byte[] O = {-99, 1, 42};
    private static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C0094a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f3923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f3924b;

        C0094a(g gVar) {
            this.f3924b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f3923a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f3924b.available())) {
                        return -1;
                    }
                    this.f3924b.y(j10);
                    this.f3923a = j10;
                }
                if (i11 > this.f3924b.available()) {
                    i11 = this.f3924b.available();
                }
                int i12 = this.f3924b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f3923a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f3923a = -1L;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final DataInputStream f3926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f3927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f3928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f3929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3930e;

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3926a = dataInputStream;
            dataInputStream.mark(0);
            this.f3927b = 0;
            this.f3928c = byteOrder;
            this.f3930e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f3930e = bArr.length;
        }

        public int a() {
            return this.f3930e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f3926a.available();
        }

        public int b() {
            return this.f3927b;
        }

        public long l() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public void o(ByteOrder byteOrder) {
            this.f3928c = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f3927b++;
            return this.f3926a.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f3926a.read(bArr, i10, i11);
            this.f3927b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f3927b++;
            return this.f3926a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f3927b++;
            int i10 = this.f3926a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f3927b += 2;
            return this.f3926a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f3927b += bArr.length;
            this.f3926a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f3927b += i11;
            this.f3926a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f3927b += 4;
            int i10 = this.f3926a.read();
            int i11 = this.f3926a.read();
            int i12 = this.f3926a.read();
            int i13 = this.f3926a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3928c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f3928c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f3927b += 8;
            int i10 = this.f3926a.read();
            int i11 = this.f3926a.read();
            int i12 = this.f3926a.read();
            int i13 = this.f3926a.read();
            int i14 = this.f3926a.read();
            int i15 = this.f3926a.read();
            int i16 = this.f3926a.read();
            int i17 = this.f3926a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3928c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f3928c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f3927b += 2;
            int i10 = this.f3926a.read();
            int i11 = this.f3926a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3928c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f3928c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f3927b += 2;
            return this.f3926a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f3927b++;
            return this.f3926a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f3927b += 2;
            int i10 = this.f3926a.read();
            int i11 = this.f3926a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3928c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f3928c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void w(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f3926a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f3929d == null) {
                        this.f3929d = new byte[8192];
                    }
                    iSkip = this.f3926a.read(this.f3929d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f3927b += i11;
        }
    }

    private static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final OutputStream f3931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteOrder f3932b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f3931a = outputStream;
            this.f3932b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f3932b = byteOrder;
        }

        public void b(int i10) throws IOException {
            this.f3931a.write(i10);
        }

        public void l(int i10) throws IOException {
            OutputStream outputStream;
            int i11;
            ByteOrder byteOrder = this.f3932b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f3931a.write((i10 >>> 0) & 255);
                this.f3931a.write((i10 >>> 8) & 255);
                this.f3931a.write((i10 >>> 16) & 255);
                outputStream = this.f3931a;
                i11 = i10 >>> 24;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f3931a.write((i10 >>> 24) & 255);
                this.f3931a.write((i10 >>> 16) & 255);
                this.f3931a.write((i10 >>> 8) & 255);
                outputStream = this.f3931a;
                i11 = i10 >>> 0;
            }
            outputStream.write(i11 & 255);
        }

        public void o(short s10) throws IOException {
            OutputStream outputStream;
            int i10;
            ByteOrder byteOrder = this.f3932b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f3931a.write((s10 >>> 0) & 255);
                outputStream = this.f3931a;
                i10 = s10 >>> 8;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f3931a.write((s10 >>> 8) & 255);
                outputStream = this.f3931a;
                i10 = s10 >>> 0;
            }
            outputStream.write(i10 & 255);
        }

        public void w(long j10) throws IOException {
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            l((int) j10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f3931a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f3931a.write(bArr, i10, i11);
        }

        public void y(int i10) throws IOException {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            o((short) i10);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f3935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f3936d;

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f3933a = i10;
            this.f3934b = i11;
            this.f3935c = j10;
            this.f3936d = bArr;
        }

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f3890p0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f3941a);
                byteBufferWrap.putInt((int) fVar.f3942b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f3890p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f3941a);
                byteBufferWrap.putInt((int) fVar.f3942b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                if (((long[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                if (((int[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f7478a);
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f7478a);
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f7478a);
                    }
                }
                return sb2.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f3941a);
                sb2.append('/');
                sb2.append(fVarArr[i10].f3942b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(com.amazon.a.a.o.b.f.f7478a);
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:151:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:182:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object o(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.X[this.f3933a] * this.f3934b;
        }

        public String toString() {
            return "(" + a.W[this.f3933a] + ", data length:" + this.f3936d.length + ")";
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3940d;

        e(String str, int i10, int i11) {
            this.f3938b = str;
            this.f3937a = i10;
            this.f3939c = i11;
            this.f3940d = -1;
        }

        e(String str, int i10, int i11, int i12) {
            this.f3938b = str;
            this.f3937a = i10;
            this.f3939c = i11;
            this.f3940d = i12;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f3939c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f3940d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f3941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f3942b;

        f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        f(long j10, long j11) {
            if (j11 == 0) {
                this.f3941a = 0L;
                this.f3942b = 1L;
            } else {
                this.f3941a = j10;
                this.f3942b = j11;
            }
        }

        public double a() {
            return this.f3941a / this.f3942b;
        }

        public String toString() {
            return this.f3941a + "/" + this.f3942b;
        }
    }

    private static class g extends b {
        g(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f3926a.mark(a.e.API_PRIORITY_OTHER);
        }

        g(byte[] bArr) {
            super(bArr);
            this.f3926a.mark(a.e.API_PRIORITY_OTHER);
        }

        public void y(long j10) throws IOException {
            int i10 = this.f3927b;
            if (i10 > j10) {
                this.f3927b = 0;
                this.f3926a.reset();
            } else {
                j10 -= (long) i10;
            }
            w((int) j10);
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f3875a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f3876b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f3877c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f3878d0 = eVarArr5;
        f3879e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f3880f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f3881g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f3882h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f3883i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f3884j0 = eVarArr10;
        f3885k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f3886l0 = new HashMap[eVarArr10.length];
        f3887m0 = new HashMap[eVarArr10.length];
        f3888n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f3889o0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f3890p0 = charsetForName;
        f3891q0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f3892r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f3884j0;
            if (i10 >= eVarArr11.length) {
                HashMap<Integer, Integer> map = f3889o0;
                e[] eVarArr12 = f3885k0;
                map.put(Integer.valueOf(eVarArr12[0].f3937a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f3937a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f3937a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f3937a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f3937a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f3937a), 8);
                f3893s0 = Pattern.compile(".*[1-9].*");
                f3894t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f3895u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f3897v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f3886l0[i10] = new HashMap<>();
            f3887m0[i10] = new HashMap<>();
            for (e eVar : eVarArr11[i10]) {
                f3886l0[i10].put(Integer.valueOf(eVar.f3937a), eVar);
                f3887m0[i10].put(eVar.f3938b, eVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f3884j0;
        this.f3907f = new HashMap[eVarArr.length];
        this.f3908g = new HashSet(eVarArr.length);
        this.f3909h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f3902a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f3891q0.length);
            if (!x(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f3906e = true;
            this.f3904c = null;
            this.f3903b = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f3904c = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (F(fileInputStream.getFD())) {
                        this.f3904c = null;
                        this.f3903b = fileInputStream.getFD();
                    }
                }
                this.f3904c = null;
            }
            this.f3903b = null;
        }
        K(inputStream);
    }

    public a(String str) throws Throwable {
        e[][] eVarArr = f3884j0;
        this.f3907f = new HashMap[eVarArr.length];
        this.f3908g = new HashSet(eVarArr.length);
        this.f3909h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        w(str);
    }

    private static boolean A(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean B(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderN = N(bVar);
            this.f3909h = byteOrderN;
            bVar.o(byteOrderN);
            short s10 = bVar.readShort();
            boolean z10 = s10 == 20306 || s10 == 21330;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean C(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean D(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean E(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderN = N(bVar);
            this.f3909h = byteOrderN;
            bVar.o(byteOrderN);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean F(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f3896v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean G(HashMap map) {
        d dVar;
        int iM;
        d dVar2 = (d) map.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f3909h);
            int[] iArr2 = f3900y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f3905d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((iM = dVar.m(this.f3909h)) == 1 && Arrays.equals(iArr, A)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f3896v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean H(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private boolean I(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f3909h) <= 512 && dVar2.m(this.f3909h) <= 512;
    }

    private boolean J(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void K(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < f3884j0.length; i10++) {
            try {
                try {
                    this.f3907f[i10] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z10 = f3896v;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                a();
                if (f3896v) {
                    M();
                }
            }
        }
        if (!this.f3906e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f3905d = i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (Z(this.f3905d)) {
            g gVar = new g(inputStream);
            if (this.f3906e) {
                p(gVar);
            } else {
                int i11 = this.f3905d;
                if (i11 == 12) {
                    g(gVar);
                } else if (i11 == 7) {
                    j(gVar);
                } else if (i11 == 10) {
                    o(gVar);
                } else {
                    m(gVar);
                }
            }
            gVar.y(this.f3917p);
            Y(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f3905d;
            if (i12 == 4) {
                h(bVar, 0, 0);
            } else if (i12 == 13) {
                k(bVar);
            } else if (i12 == 9) {
                l(bVar);
            } else if (i12 == 14) {
                s(bVar);
            }
        }
    }

    private void L(b bVar) throws IOException {
        ByteOrder byteOrderN = N(bVar);
        this.f3909h = byteOrderN;
        bVar.o(byteOrderN);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f3905d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.w(i12);
        }
    }

    private void M() {
        for (int i10 = 0; i10 < this.f3907f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f3907f[i10].size());
            for (Map.Entry<String, d> entry : this.f3907f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f3909h) + "'");
            }
        }
    }

    private ByteOrder N(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f3896v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f3896v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void O(byte[] bArr, int i10) throws IOException {
        g gVar = new g(bArr);
        L(gVar);
        P(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void P(androidx.exifinterface.media.a.g r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.P(androidx.exifinterface.media.a$g, int):void");
    }

    private void Q(String str) {
        for (int i10 = 0; i10 < f3884j0.length; i10++) {
            this.f3907f[i10].remove(str);
        }
    }

    private void R(int i10, String str, String str2) {
        if (this.f3907f[i10].isEmpty() || this.f3907f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f3907f[i10];
        map.put(str2, map.get(str));
        this.f3907f[i10].remove(str);
    }

    private void S(g gVar, int i10) throws Throwable {
        d dVar = this.f3907f[i10].get("ImageLength");
        d dVar2 = this.f3907f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f3907f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f3907f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f3909h);
            int iM2 = dVar3.m(this.f3909h);
            gVar.y(iM);
            byte[] bArr = new byte[iM2];
            gVar.readFully(bArr);
            h(new b(bArr), iM, i10);
        }
    }

    private void U(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f3896v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d dVarRemove = null;
        if (d("Xmp") != null && this.f3922u) {
            dVarRemove = this.f3907f[0].remove("Xmp");
        }
        cVar.b(-1);
        cVar.b(-31);
        d0(cVar);
        if (dVarRemove != null) {
            this.f3907f[0].put("Xmp", dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.b(-1);
                cVar.b(b10);
                androidx.exifinterface.media.b.d(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.b(-1);
                cVar.b(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.y(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (i11 >= 0) {
                        cVar.write(bArr, 0, i11);
                        i10 -= i11;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort() - 2;
                if (unsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (unsignedShort2 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f3891q0)) {
                        bVar.w(unsignedShort2 - 6);
                    }
                }
                cVar.b(-1);
                cVar.b(b10);
                cVar.y(unsignedShort2 + 2);
                if (unsignedShort2 >= 6) {
                    unsignedShort2 -= 6;
                    cVar.write(bArr2);
                }
                while (unsignedShort2 > 0) {
                    int i12 = bVar.read(bArr, 0, Math.min(unsignedShort2, 4096));
                    if (i12 >= 0) {
                        cVar.write(bArr, 0, i12);
                        unsignedShort2 -= i12;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void V(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (f3896v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = H;
        androidx.exifinterface.media.b.e(bVar, cVar, bArr.length);
        int i10 = this.f3917p;
        if (i10 == 0) {
            int i11 = bVar.readInt();
            cVar.l(i11);
            androidx.exifinterface.media.b.e(bVar, cVar, i11 + 4 + 4);
        } else {
            androidx.exifinterface.media.b.e(bVar, cVar, ((i10 - bArr.length) - 4) - 4);
            bVar.w(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                d0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f3931a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.l((int) crc32.getValue());
                androidx.exifinterface.media.b.b(byteArrayOutputStream2);
                androidx.exifinterface.media.b.d(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.b.b(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void W(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i10;
        int i11;
        int i12;
        boolean z10;
        if (f3896v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = L;
        androidx.exifinterface.media.b.e(bVar, cVar, bArr.length);
        byte[] bArr2 = M;
        bVar.w(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i13 = this.f3917p;
                    if (i13 != 0) {
                        androidx.exifinterface.media.b.e(bVar, cVar2, ((i13 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        bVar.w(4);
                        int i14 = bVar.readInt();
                        if (i14 % 2 != 0) {
                            i14++;
                        }
                        bVar.w(i14);
                    } else {
                        byte[] bArr3 = new byte[4];
                        bVar.readFully(bArr3);
                        byte[] bArr4 = P;
                        boolean z11 = true;
                        if (!Arrays.equals(bArr3, bArr4)) {
                            byte[] bArr5 = R;
                            if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, Q)) {
                                int i15 = bVar.readInt();
                                int i16 = i15 % 2 == 1 ? i15 + 1 : i15;
                                byte[] bArr6 = new byte[3];
                                if (Arrays.equals(bArr3, bArr5)) {
                                    bVar.readFully(bArr6);
                                    byte[] bArr7 = new byte[3];
                                    bVar.readFully(bArr7);
                                    if (!Arrays.equals(O, bArr7)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    int i17 = bVar.readInt();
                                    i12 = (i17 << 2) >> 18;
                                    i16 -= 10;
                                    i10 = (i17 << 18) >> 18;
                                    i11 = i17;
                                    z11 = false;
                                } else if (!Arrays.equals(bArr3, Q)) {
                                    i10 = 0;
                                    z11 = false;
                                    i11 = 0;
                                    i12 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Error checking VP8L signature");
                                    }
                                    i11 = bVar.readInt();
                                    i10 = (i11 & 16383) + 1;
                                    i12 = ((i11 & 268419072) >>> 14) + 1;
                                    if ((i11 & 268435456) == 0) {
                                        z11 = false;
                                    }
                                    i16 -= 5;
                                }
                                cVar2.write(bArr4);
                                cVar2.l(10);
                                byte[] bArr8 = new byte[10];
                                if (z11) {
                                    bArr8[0] = (byte) (bArr8[0] | 16);
                                }
                                bArr8[0] = (byte) (bArr8[0] | 8);
                                int i18 = i10 - 1;
                                int i19 = i12 - 1;
                                bArr8[4] = (byte) i18;
                                bArr8[5] = (byte) (i18 >> 8);
                                bArr8[6] = (byte) (i18 >> 16);
                                bArr8[7] = (byte) i19;
                                bArr8[8] = (byte) (i19 >> 8);
                                bArr8[9] = (byte) (i19 >> 16);
                                cVar2.write(bArr8);
                                cVar2.write(bArr3);
                                cVar2.l(i15);
                                if (Arrays.equals(bArr3, bArr5)) {
                                    cVar2.write(bArr6);
                                    cVar2.write(O);
                                } else {
                                    if (Arrays.equals(bArr3, Q)) {
                                        cVar2.write(47);
                                    }
                                    androidx.exifinterface.media.b.e(bVar, cVar2, i16);
                                }
                                cVar2.l(i11);
                                androidx.exifinterface.media.b.e(bVar, cVar2, i16);
                            }
                            androidx.exifinterface.media.b.d(bVar, cVar2);
                            int size = byteArrayOutputStream2.size();
                            byte[] bArr9 = M;
                            cVar.l(size + bArr9.length);
                            cVar.write(bArr9);
                            byteArrayOutputStream2.writeTo(cVar);
                            androidx.exifinterface.media.b.b(byteArrayOutputStream2);
                        }
                        int i20 = bVar.readInt();
                        byte[] bArr10 = new byte[i20 % 2 == 1 ? i20 + 1 : i20];
                        bVar.readFully(bArr10);
                        byte b10 = (byte) (8 | bArr10[0]);
                        bArr10[0] = b10;
                        boolean z12 = ((b10 >> 1) & 1) == 1;
                        cVar2.write(bArr4);
                        cVar2.l(i20);
                        cVar2.write(bArr10);
                        if (z12) {
                            b(bVar, cVar2, S, null);
                            while (true) {
                                byte[] bArr11 = new byte[4];
                                try {
                                    bVar.readFully(bArr11);
                                    z10 = !Arrays.equals(bArr11, T);
                                } catch (EOFException unused) {
                                    z10 = true;
                                }
                                if (z10) {
                                    break;
                                } else {
                                    c(bVar, cVar2, bArr11);
                                }
                            }
                        } else {
                            b(bVar, cVar2, R, Q);
                        }
                    }
                    d0(cVar2);
                    androidx.exifinterface.media.b.d(bVar, cVar2);
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr92 = M;
                    cVar.l(size2 + bArr92.length);
                    cVar.write(bArr92);
                    byteArrayOutputStream2.writeTo(cVar);
                    androidx.exifinterface.media.b.b(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    androidx.exifinterface.media.b.b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void Y(b bVar) throws Throwable {
        HashMap<String, d> map = this.f3907f[4];
        d dVar = map.get("Compression");
        if (dVar != null) {
            int iM = dVar.m(this.f3909h);
            this.f3916o = iM;
            if (iM != 1) {
                if (iM != 6) {
                    if (iM != 7) {
                        return;
                    }
                }
            }
            if (G(map)) {
                v(bVar, map);
                return;
            }
            return;
        }
        this.f3916o = 6;
        u(bVar, map);
    }

    private static boolean Z(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void a() {
        String strD = d("DateTimeOriginal");
        if (strD != null && d("DateTime") == null) {
            this.f3907f[0].put("DateTime", d.e(strD));
        }
        if (d("ImageWidth") == null) {
            this.f3907f[0].put("ImageWidth", d.f(0L, this.f3909h));
        }
        if (d("ImageLength") == null) {
            this.f3907f[0].put("ImageLength", d.f(0L, this.f3909h));
        }
        if (d("Orientation") == null) {
            this.f3907f[0].put("Orientation", d.f(0L, this.f3909h));
        }
        if (d("LightSource") == null) {
            this.f3907f[1].put("LightSource", d.f(0L, this.f3909h));
        }
    }

    private void a0(int i10, int i11) throws Throwable {
        String str;
        if (this.f3907f[i10].isEmpty() || this.f3907f[i11].isEmpty()) {
            if (f3896v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f3907f[i10].get("ImageLength");
        d dVar2 = this.f3907f[i10].get("ImageWidth");
        d dVar3 = this.f3907f[i11].get("ImageLength");
        d dVar4 = this.f3907f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (!f3896v) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (dVar3 != null && dVar4 != null) {
                int iM = dVar.m(this.f3909h);
                int iM2 = dVar2.m(this.f3909h);
                int iM3 = dVar3.m(this.f3909h);
                int iM4 = dVar4.m(this.f3909h);
                if (iM >= iM3 || iM2 >= iM4) {
                    return;
                }
                HashMap<String, d>[] mapArr = this.f3907f;
                HashMap<String, d> map = mapArr[i10];
                mapArr[i10] = mapArr[i11];
                mapArr[i11] = map;
                return;
            }
            if (!f3896v) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    private void b(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            c(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void b0(g gVar, int i10) throws Throwable {
        StringBuilder sb2;
        String string;
        d dVarJ;
        d dVarJ2;
        d dVar = this.f3907f[i10].get("DefaultCropSize");
        d dVar2 = this.f3907f[i10].get("SensorTopBorder");
        d dVar3 = this.f3907f[i10].get("SensorLeftBorder");
        d dVar4 = this.f3907f[i10].get("SensorBottomBorder");
        d dVar5 = this.f3907f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                S(gVar, i10);
                return;
            }
            int iM = dVar2.m(this.f3909h);
            int iM2 = dVar4.m(this.f3909h);
            int iM3 = dVar5.m(this.f3909h);
            int iM4 = dVar3.m(this.f3909h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.f3909h);
            d dVarJ4 = d.j(iM3 - iM4, this.f3909h);
            this.f3907f[i10].put("ImageLength", dVarJ3);
            this.f3907f[i10].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.f3933a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f3909h);
            if (fVarArr != null && fVarArr.length == 2) {
                dVarJ = d.h(fVarArr[0], this.f3909h);
                dVarJ2 = d.h(fVarArr[1], this.f3909h);
                this.f3907f[i10].put("ImageWidth", dVarJ);
                this.f3907f[i10].put("ImageLength", dVarJ2);
                return;
            }
            sb2 = new StringBuilder();
            sb2.append("Invalid crop size values. cropSize=");
            string = Arrays.toString(fVarArr);
            sb2.append(string);
            Log.w("ExifInterface", sb2.toString());
        }
        int[] iArr = (int[]) dVar.o(this.f3909h);
        if (iArr != null && iArr.length == 2) {
            dVarJ = d.j(iArr[0], this.f3909h);
            dVarJ2 = d.j(iArr[1], this.f3909h);
            this.f3907f[i10].put("ImageWidth", dVarJ);
            this.f3907f[i10].put("ImageLength", dVarJ2);
            return;
        }
        sb2 = new StringBuilder();
        sb2.append("Invalid crop size values. cropSize=");
        string = Arrays.toString(iArr);
        sb2.append(string);
        Log.w("ExifInterface", sb2.toString());
    }

    private void c(b bVar, c cVar, byte[] bArr) throws IOException {
        int i10 = bVar.readInt();
        cVar.write(bArr);
        cVar.l(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        androidx.exifinterface.media.b.e(bVar, cVar, i10);
    }

    private void c0() throws Throwable {
        a0(0, 5);
        a0(0, 4);
        a0(5, 4);
        d dVar = this.f3907f[1].get("PixelXDimension");
        d dVar2 = this.f3907f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f3907f[0].put("ImageWidth", dVar);
            this.f3907f[0].put("ImageLength", dVar2);
        }
        if (this.f3907f[4].isEmpty() && I(this.f3907f[5])) {
            HashMap<String, d>[] mapArr = this.f3907f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!I(this.f3907f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        R(0, "ThumbnailOrientation", "Orientation");
        R(0, "ThumbnailImageLength", "ImageLength");
        R(0, "ThumbnailImageWidth", "ImageWidth");
        R(5, "ThumbnailOrientation", "Orientation");
        R(5, "ThumbnailImageLength", "ImageLength");
        R(5, "ThumbnailImageWidth", "ImageWidth");
        R(4, "Orientation", "ThumbnailOrientation");
        R(4, "ImageLength", "ThumbnailImageLength");
        R(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int d0(c cVar) throws IOException {
        e[][] eVarArr = f3884j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f3885k0) {
            Q(eVar.f3938b);
        }
        if (this.f3910i) {
            if (this.f3911j) {
                Q("StripOffsets");
                Q("StripByteCounts");
            } else {
                Q("JPEGInterchangeFormat");
                Q("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f3884j0.length; i10++) {
            for (Object obj : this.f3907f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f3907f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f3907f[1].isEmpty()) {
            this.f3907f[0].put(f3885k0[1].f3938b, d.f(0L, this.f3909h));
        }
        if (!this.f3907f[2].isEmpty()) {
            this.f3907f[0].put(f3885k0[2].f3938b, d.f(0L, this.f3909h));
        }
        if (!this.f3907f[3].isEmpty()) {
            this.f3907f[1].put(f3885k0[3].f3938b, d.f(0L, this.f3909h));
        }
        if (this.f3910i) {
            if (this.f3911j) {
                this.f3907f[4].put("StripOffsets", d.j(0, this.f3909h));
                this.f3907f[4].put("StripByteCounts", d.j(this.f3914m, this.f3909h));
            } else {
                this.f3907f[4].put("JPEGInterchangeFormat", d.f(0L, this.f3909h));
                this.f3907f[4].put("JPEGInterchangeFormatLength", d.f(this.f3914m, this.f3909h));
            }
        }
        for (int i11 = 0; i11 < f3884j0.length; i11++) {
            Iterator<Map.Entry<String, d>> it = this.f3907f[i11].entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int iP = it.next().getValue().p();
                if (iP > 4) {
                    i12 += iP;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < f3884j0.length; i13++) {
            if (!this.f3907f[i13].isEmpty()) {
                iArr[i13] = size;
                size += (this.f3907f[i13].size() * 12) + 2 + 4 + iArr2[i13];
            }
        }
        if (this.f3910i) {
            if (this.f3911j) {
                this.f3907f[4].put("StripOffsets", d.j(size, this.f3909h));
            } else {
                this.f3907f[4].put("JPEGInterchangeFormat", d.f(size, this.f3909h));
            }
            this.f3913l = size;
            size += this.f3914m;
        }
        if (this.f3905d == 4) {
            size += 8;
        }
        if (f3896v) {
            for (int i14 = 0; i14 < f3884j0.length; i14++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i14), Integer.valueOf(iArr[i14]), Integer.valueOf(this.f3907f[i14].size()), Integer.valueOf(iArr2[i14]), Integer.valueOf(size)));
            }
        }
        if (!this.f3907f[1].isEmpty()) {
            this.f3907f[0].put(f3885k0[1].f3938b, d.f(iArr[1], this.f3909h));
        }
        if (!this.f3907f[2].isEmpty()) {
            this.f3907f[0].put(f3885k0[2].f3938b, d.f(iArr[2], this.f3909h));
        }
        if (!this.f3907f[3].isEmpty()) {
            this.f3907f[1].put(f3885k0[3].f3938b, d.f(iArr[3], this.f3909h));
        }
        int i15 = this.f3905d;
        if (i15 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.y(size);
            cVar.write(f3891q0);
        } else if (i15 == 13) {
            cVar.l(size);
            cVar.write(I);
        } else if (i15 == 14) {
            cVar.write(N);
            cVar.l(size);
        }
        cVar.o(this.f3909h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.f3909h);
        cVar.y(42);
        cVar.w(8L);
        for (int i16 = 0; i16 < f3884j0.length; i16++) {
            if (!this.f3907f[i16].isEmpty()) {
                cVar.y(this.f3907f[i16].size());
                int size2 = iArr[i16] + 2 + (this.f3907f[i16].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f3907f[i16].entrySet()) {
                    int i17 = f3887m0[i16].get(entry2.getKey()).f3937a;
                    d value = entry2.getValue();
                    int iP2 = value.p();
                    cVar.y(i17);
                    cVar.y(value.f3933a);
                    cVar.l(value.f3934b);
                    if (iP2 > 4) {
                        cVar.w(size2);
                        size2 += iP2;
                    } else {
                        cVar.write(value.f3936d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.b(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i16 != 0 || this.f3907f[4].isEmpty()) {
                    cVar.w(0L);
                } else {
                    cVar.w(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f3907f[i16].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f3936d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f3910i) {
            cVar.write(r());
        }
        if (this.f3905d == 14 && size % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return size;
    }

    private d f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f3896v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f3884j0.length; i10++) {
            d dVar = this.f3907f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void g(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0095b.a(mediaMetadataRetriever, new C0094a(gVar));
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(17);
                String strExtractMetadata7 = null;
                if ("yes".equals(strExtractMetadata5)) {
                    strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                }
                if (strExtractMetadata7 != null) {
                    this.f3907f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata7), this.f3909h));
                }
                if (strExtractMetadata != null) {
                    this.f3907f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata), this.f3909h));
                }
                if (strExtractMetadata2 != null) {
                    int i10 = 1;
                    int i11 = Integer.parseInt(strExtractMetadata2);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 == 180) {
                        i10 = 3;
                    } else if (i11 == 270) {
                        i10 = 8;
                    }
                    this.f3907f[0].put("Orientation", d.j(i10, this.f3909h));
                }
                if (strExtractMetadata3 != null && strExtractMetadata4 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata3);
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.y(i12);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f3891q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    gVar.readFully(bArr2);
                    this.f3917p = i14;
                    O(bArr2, 0);
                }
                if (f3896v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata7 + "x" + strExtractMetadata + ", rotation " + strExtractMetadata2);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x018f, code lost:
    
        r22.o(r21.f3909h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0194, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179 A[LOOP:0: B:10:0x0038->B:59:0x0179, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h(androidx.exifinterface.media.a.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.h(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int i(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (A(bArr)) {
            return 4;
        }
        if (D(bArr)) {
            return 9;
        }
        if (z(bArr)) {
            return 12;
        }
        if (B(bArr)) {
            return 7;
        }
        if (E(bArr)) {
            return 10;
        }
        if (C(bArr)) {
            return 13;
        }
        return J(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(androidx.exifinterface.media.a.g r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.j(androidx.exifinterface.media.a$g):void");
    }

    private void k(b bVar) throws Throwable {
        if (f3896v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.o(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.w(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = length + 4 + 4;
                if (i11 == 16 && !Arrays.equals(bArr2, J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, K)) {
                    return;
                }
                if (Arrays.equals(bArr2, I)) {
                    byte[] bArr3 = new byte[i10];
                    bVar.readFully(bArr3);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f3917p = i11;
                        O(bArr3, 0);
                        c0();
                        Y(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.w(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void l(b bVar) throws Throwable {
        boolean z10 = f3896v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.w(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.w(i10 - bVar.b());
        bVar.readFully(bArr4);
        h(new b(bArr4), i10, 5);
        bVar.w(i12 - bVar.b());
        bVar.o(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f3879e0.f3937a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarJ = d.j(s10, this.f3909h);
                d dVarJ2 = d.j(s11, this.f3909h);
                this.f3907f[0].put("ImageLength", dVarJ);
                this.f3907f[0].put("ImageWidth", dVarJ2);
                if (f3896v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.w(unsignedShort2);
        }
    }

    private void m(g gVar) throws Throwable {
        d dVar;
        L(gVar);
        P(gVar, 0);
        b0(gVar, 0);
        b0(gVar, 5);
        b0(gVar, 4);
        c0();
        if (this.f3905d != 8 || (dVar = this.f3907f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f3936d);
        gVar2.o(this.f3909h);
        gVar2.w(6);
        P(gVar2, 9);
        d dVar2 = this.f3907f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f3907f[1].put("ColorSpace", dVar2);
        }
    }

    private void o(g gVar) throws Throwable {
        if (f3896v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m(gVar);
        d dVar = this.f3907f[0].get("JpgFromRaw");
        if (dVar != null) {
            h(new b(dVar.f3936d), (int) dVar.f3935c, 5);
        }
        d dVar2 = this.f3907f[0].get("ISO");
        d dVar3 = this.f3907f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f3907f[1].put("PhotographicSensitivity", dVar2);
    }

    private void p(g gVar) throws IOException {
        byte[] bArr = f3891q0;
        gVar.w(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f3917p = bArr.length;
        O(bArr2, 0);
    }

    private void s(b bVar) throws Throwable {
        if (f3896v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.o(ByteOrder.LITTLE_ENDIAN);
        bVar.w(L.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = M;
        bVar.w(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 4 + 4;
                if (Arrays.equals(N, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    bVar.readFully(bArr3);
                    this.f3917p = i12;
                    O(bArr3, 0);
                    Y(new b(bArr3));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.w(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> t(String str) {
        if (str.contains(com.amazon.a.a.o.b.f.f7478a)) {
            String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f7478a, -1);
            Pair<Integer, Integer> pairT = t(strArrSplit[0]);
            if (((Integer) pairT.first).intValue() == 2) {
                return pairT;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairT2 = t(strArrSplit[i10]);
                int iIntValue = (((Integer) pairT2.first).equals(pairT.first) || ((Integer) pairT2.second).equals(pairT.first)) ? ((Integer) pairT.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairT.second).intValue() == -1 || !(((Integer) pairT2.first).equals(pairT.second) || ((Integer) pairT2.second).equals(pairT.second))) ? -1 : ((Integer) pairT.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairT = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairT = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairT;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    return (lValueOf.longValue() < 0 || lValueOf.longValue() > 65535) ? lValueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j10 = (long) Double.parseDouble(strArrSplit2[0]);
                long j11 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j10 >= 0 && j11 >= 0) {
                    if (j10 <= 2147483647L && j11 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void u(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f3909h);
        int iM2 = dVar2.m(this.f3909h);
        if (this.f3905d == 7) {
            iM += this.f3918q;
        }
        if (iM > 0 && iM2 > 0) {
            this.f3910i = true;
            if (this.f3902a == null && this.f3904c == null && this.f3903b == null) {
                byte[] bArr = new byte[iM2];
                bVar.w(iM);
                bVar.readFully(bArr);
                this.f3915n = bArr;
            }
            this.f3913l = iM;
            this.f3914m = iM2;
        }
        if (f3896v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iM2);
        }
    }

    private void v(b bVar, HashMap map) throws IOException {
        d dVar = (d) map.get("StripOffsets");
        d dVar2 = (d) map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrC = androidx.exifinterface.media.b.c(dVar.o(this.f3909h));
        long[] jArrC2 = androidx.exifinterface.media.b.c(dVar2.o(this.f3909h));
        if (jArrC == null || jArrC.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrC2 == null || jArrC2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrC.length != jArrC2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrC2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = 1;
        this.f3912k = true;
        this.f3911j = true;
        this.f3910i = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < jArrC.length) {
            int i15 = (int) jArrC[i12];
            int i16 = (int) jArrC2[i12];
            if (i12 < jArrC.length - i11 && i15 + i16 != jArrC[i12 + 1]) {
                this.f3912k = false;
            }
            int i17 = i15 - i13;
            if (i17 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.w(i17);
                int i18 = i13 + i17;
                byte[] bArr2 = new byte[i16];
                try {
                    bVar.readFully(bArr2);
                    i13 = i18 + i16;
                    System.arraycopy(bArr2, 0, bArr, i14, i16);
                    i14 += i16;
                    i12++;
                    i11 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i16 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i17 + " bytes.");
                return;
            }
        }
        this.f3915n = bArr;
        if (this.f3912k) {
            this.f3913l = (int) jArrC[0];
            this.f3914m = i10;
        }
    }

    private void w(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f3904c = null;
        this.f3902a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (F(fileInputStream.getFD())) {
                this.f3903b = fileInputStream.getFD();
            } else {
                this.f3903b = null;
            }
            K(fileInputStream);
            androidx.exifinterface.media.b.b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.b(fileInputStream2);
            throw th;
        }
    }

    private static boolean x(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f3891q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f3891q0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean z(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, C)) {
                        bVar2.close();
                        return false;
                    }
                    long j10 = 16;
                    if (length == 1) {
                        length = bVar2.readLong();
                        if (length < 16) {
                            bVar2.close();
                            return false;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z10 = false;
                    boolean z11 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        try {
                            bVar2.readFully(bArr3);
                            if (j12 != 1) {
                                if (Arrays.equals(bArr3, D)) {
                                    z10 = true;
                                } else if (Arrays.equals(bArr3, E)) {
                                    z11 = true;
                                }
                                if (z10 && z11) {
                                    bVar2.close();
                                    return true;
                                }
                            }
                        } catch (EOFException unused) {
                            bVar2.close();
                            return false;
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f3896v) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.T():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void X(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.X(java.lang.String, java.lang.String):void");
    }

    public String d(String str) {
        String str2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarF = f(str);
        if (dVarF != null) {
            if (!f3888n0.contains(str)) {
                return dVarF.n(this.f3909h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = dVarF.f3933a;
                if (i10 == 5 || i10 == 10) {
                    f[] fVarArr = (f[]) dVarF.o(this.f3909h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        f fVar = fVarArr[0];
                        f fVar2 = fVarArr[1];
                        f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (fVar.f3941a / fVar.f3942b)), Integer.valueOf((int) (fVar2.f3941a / fVar2.f3942b)), Integer.valueOf((int) (fVar3.f3941a / fVar3.f3942b)));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + dVarF.f3933a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(dVarF.l(this.f3909h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int e(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarF = f(str);
        if (dVarF == null) {
            return i10;
        }
        try {
            return dVarF.m(this.f3909h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public int n() {
        switch (e("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] q() {
        int i10 = this.f3916o;
        if (i10 == 6 || i10 == 7) {
            return r();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] r() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f3910i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.f3915n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f3904c     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            if (r1 == 0) goto L2d
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r3 == 0) goto L1c
            r1.reset()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L1a:
            r3 = r2
            goto L4e
        L1c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            androidx.exifinterface.media.b.b(r1)
            return r2
        L25:
            r0 = move-exception
            r3 = r2
            goto L8d
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L7e
        L2d:
            java.lang.String r1 = r8.f3902a     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            if (r1 == 0) goto L39
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            java.lang.String r3 = r8.f3902a     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            goto L1a
        L39:
            java.io.FileDescriptor r1 = r8.f3903b     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            java.io.FileDescriptor r1 = androidx.exifinterface.media.b.a.b(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            androidx.exifinterface.media.b.a.c(r1, r3, r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            r7 = r3
            r3 = r1
            r1 = r7
        L4e:
            androidx.exifinterface.media.a$b r4 = new androidx.exifinterface.media.a$b     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            r4.<init>(r1)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            int r5 = r8.f3913l     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            int r6 = r8.f3917p     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            int r5 = r5 + r6
            r4.w(r5)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            int r5 = r8.f3914m     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            r4.readFully(r5)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            r8.f3915n = r5     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8c
            androidx.exifinterface.media.b.b(r1)
            if (r3 == 0) goto L6c
            androidx.exifinterface.media.b.a(r3)
        L6c:
            return r5
        L6d:
            r4 = move-exception
            goto L7e
        L6f:
            r0 = move-exception
            r3 = r1
            goto L8e
        L72:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L7e
        L77:
            r0 = move-exception
            r3 = r2
            goto L8e
        L7a:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L7e:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L8c
            androidx.exifinterface.media.b.b(r1)
            if (r3 == 0) goto L8b
            androidx.exifinterface.media.b.a(r3)
        L8b:
            return r2
        L8c:
            r0 = move-exception
        L8d:
            r2 = r1
        L8e:
            androidx.exifinterface.media.b.b(r2)
            if (r3 == 0) goto L96
            androidx.exifinterface.media.b.a(r3)
        L96:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.r():byte[]");
    }

    public boolean y() {
        int iE = e("Orientation", 1);
        return iE == 2 || iE == 7 || iE == 4 || iE == 5;
    }
}
