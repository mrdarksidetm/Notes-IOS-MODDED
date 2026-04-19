package m4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {
    private m4.a A;
    private int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MediaCodec f15335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f15336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f15337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f15338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f15340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f15341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f15342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f15343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f15344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f15345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f15346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f15347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f15348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f15349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f15350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f15351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ByteBuffer f15352r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    e f15356v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private SurfaceTexture f15357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Surface f15358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Surface f15359y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private m4.b f15360z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<ByteBuffer> f15353s = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList<ByteBuffer> f15354t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ArrayList<Integer> f15355u = new ArrayList<>();
    private final float[] C = new float[16];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.C();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.I();
        }
    }

    public static abstract class c {
        public abstract void a(d dVar);

        public abstract void b(d dVar, ByteBuffer byteBuffer);

        public abstract void c(d dVar, MediaCodec.CodecException codecException);

        public abstract void d(d dVar, MediaFormat mediaFormat);
    }

    /* JADX INFO: renamed from: m4.d$d, reason: collision with other inner class name */
    class C0350d extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f15363a;

        C0350d() {
        }

        private void a(MediaCodec.CodecException codecException) {
            d.this.I();
            if (codecException == null) {
                d dVar = d.this;
                dVar.f15336b.a(dVar);
            } else {
                d dVar2 = d.this;
                dVar2.f15336b.c(dVar2, codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            if (mediaCodec != d.this.f15335a) {
                return;
            }
            Log.e("HeifEncoder", "onError: " + codecException);
            a(codecException);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
            d dVar = d.this;
            if (mediaCodec != dVar.f15335a || dVar.f15349o) {
                return;
            }
            dVar.f15355u.add(Integer.valueOf(i10));
            d.this.C();
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
            if (mediaCodec != d.this.f15335a || this.f15363a) {
                return;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i10);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                e eVar = d.this.f15356v;
                if (eVar != null) {
                    eVar.e(bufferInfo.presentationTimeUs);
                }
                d dVar = d.this;
                dVar.f15336b.b(dVar, outputBuffer);
            }
            this.f15363a = ((bufferInfo.flags & 4) != 0) | this.f15363a;
            mediaCodec.releaseOutputBuffer(i10, false);
            if (this.f15363a) {
                a(null);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            if (mediaCodec != d.this.f15335a) {
                return;
            }
            if (!"image/vnd.android.heic".equals(mediaFormat.getString("mime"))) {
                mediaFormat.setString("mime", "image/vnd.android.heic");
                mediaFormat.setInteger("width", d.this.f15340f);
                mediaFormat.setInteger("height", d.this.f15341g);
                d dVar = d.this;
                if (dVar.f15347m) {
                    mediaFormat.setInteger("tile-width", dVar.f15342h);
                    mediaFormat.setInteger("tile-height", d.this.f15343i);
                    mediaFormat.setInteger("grid-rows", d.this.f15344j);
                    mediaFormat.setInteger("grid-cols", d.this.f15345k);
                }
            }
            d dVar2 = d.this;
            dVar2.f15336b.d(dVar2, mediaFormat);
        }
    }

    private class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f15365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f15366b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f15367c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f15368d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f15369e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f15370f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f15371g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaCodec mediaCodec = d.this.f15335a;
                if (mediaCodec != null) {
                    mediaCodec.signalEndOfInputStream();
                }
            }
        }

        e(boolean z10) {
            this.f15365a = z10;
        }

        private void a() {
            d.this.f15338d.post(new a());
            this.f15371g = true;
        }

        private void b() {
            if (this.f15371g) {
                return;
            }
            if (this.f15368d < 0) {
                long j10 = this.f15366b;
                if (j10 >= 0 && this.f15367c >= j10) {
                    long j11 = this.f15369e;
                    if (j11 < 0) {
                        a();
                        return;
                    }
                    this.f15368d = j11;
                }
            }
            long j12 = this.f15368d;
            if (j12 < 0 || j12 > this.f15370f) {
                return;
            }
            a();
        }

        synchronized void c(long j10) {
            if (this.f15365a) {
                if (this.f15366b < 0) {
                    this.f15366b = j10;
                }
            } else if (this.f15368d < 0) {
                this.f15368d = j10 / 1000;
            }
            b();
        }

        synchronized boolean d(long j10, long j11) {
            boolean z10;
            long j12 = this.f15366b;
            z10 = j12 < 0 || j10 <= j12;
            if (z10) {
                this.f15369e = j11;
            }
            this.f15367c = j10;
            b();
            return z10;
        }

        synchronized void e(long j10) {
            this.f15370f = j10;
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(int r20, int r21, boolean r22, int r23, int r24, android.os.Handler r25, m4.d.c r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.d.<init>(int, int, boolean, int, int, android.os.Handler, m4.d$c):void");
    }

    private ByteBuffer A() {
        if (!this.f15349o && this.f15352r == null) {
            synchronized (this.f15354t) {
                this.f15352r = this.f15354t.isEmpty() ? null : this.f15354t.remove(0);
            }
        }
        if (this.f15349o) {
            return null;
        }
        return this.f15352r;
    }

    private void E(boolean z10) {
        synchronized (this.f15353s) {
            this.f15349o = z10 | this.f15349o;
            this.f15353s.add(this.f15352r);
            this.f15353s.notifyAll();
        }
        this.f15352r = null;
    }

    private ByteBuffer a() {
        ByteBuffer byteBufferRemove;
        synchronized (this.f15353s) {
            while (!this.f15349o && this.f15353s.isEmpty()) {
                try {
                    this.f15353s.wait();
                } catch (InterruptedException unused) {
                }
            }
            byteBufferRemove = this.f15349o ? null : this.f15353s.remove(0);
        }
        return byteBufferRemove;
    }

    private void l(byte[] bArr) {
        ByteBuffer byteBufferA = a();
        if (byteBufferA == null) {
            return;
        }
        byteBufferA.clear();
        if (bArr != null) {
            byteBufferA.put(bArr);
        }
        byteBufferA.flip();
        synchronized (this.f15354t) {
            this.f15354t.add(byteBufferA);
        }
        this.f15338d.post(new a());
    }

    private long o(int i10) {
        return ((((long) i10) * 1000000) / ((long) this.f15346l)) + 132;
    }

    private static void w(ByteBuffer byteBuffer, Image image, int i10, int i11, Rect rect, Rect rect2) {
        int i12;
        int i13;
        if (rect.width() != rect2.width() || rect.height() != rect2.height()) {
            throw new IllegalArgumentException("src and dst rect size are different!");
        }
        if (i10 % 2 == 0 && i11 % 2 == 0) {
            int i14 = 2;
            if (rect.left % 2 == 0 && rect.top % 2 == 0 && rect.right % 2 == 0 && rect.bottom % 2 == 0 && rect2.left % 2 == 0 && rect2.top % 2 == 0 && rect2.right % 2 == 0 && rect2.bottom % 2 == 0) {
                Image.Plane[] planes = image.getPlanes();
                int i15 = 0;
                while (i15 < planes.length) {
                    ByteBuffer buffer = planes[i15].getBuffer();
                    int pixelStride = planes[i15].getPixelStride();
                    int iMin = Math.min(rect.width(), i10 - rect.left);
                    int iMin2 = Math.min(rect.height(), i11 - rect.top);
                    if (i15 > 0) {
                        i13 = ((i10 * i11) * (i15 + 3)) / 4;
                        i12 = i14;
                    } else {
                        i12 = 1;
                        i13 = 0;
                    }
                    for (int i16 = 0; i16 < iMin2 / i12; i16++) {
                        byteBuffer.position(((((rect.top / i12) + i16) * i10) / i12) + i13 + (rect.left / i12));
                        buffer.position((((rect2.top / i12) + i16) * planes[i15].getRowStride()) + ((rect2.left * pixelStride) / i12));
                        int i17 = 0;
                        while (true) {
                            int i18 = iMin / i12;
                            if (i17 < i18) {
                                buffer.put(byteBuffer.get());
                                if (pixelStride > 1 && i17 != i18 - 1) {
                                    buffer.position((buffer.position() + pixelStride) - 1);
                                }
                                i17++;
                            }
                        }
                    }
                    i15++;
                    i14 = 2;
                }
                return;
            }
        }
        throw new IllegalArgumentException("src or dst are not aligned!");
    }

    private void y() {
        GLES20.glViewport(0, 0, this.f15342h, this.f15343i);
        for (int i10 = 0; i10 < this.f15344j; i10++) {
            for (int i11 = 0; i11 < this.f15345k; i11++) {
                int i12 = this.f15342h;
                int i13 = i11 * i12;
                int i14 = this.f15343i;
                int i15 = i10 * i14;
                this.f15350p.set(i13, i15, i12 + i13, i14 + i15);
                this.A.a(this.B, f.f15406i, this.f15350p);
                m4.b bVar = this.f15360z;
                int i16 = this.f15348n;
                this.f15348n = i16 + 1;
                bVar.i(o(i16) * 1000);
                this.f15360z.j();
            }
        }
    }

    void C() {
        while (true) {
            ByteBuffer byteBufferA = A();
            if (byteBufferA == null || this.f15355u.isEmpty()) {
                return;
            }
            int iIntValue = this.f15355u.remove(0).intValue();
            boolean z10 = this.f15348n % this.f15346l == 0 && byteBufferA.remaining() == 0;
            if (!z10) {
                Image inputImage = this.f15335a.getInputImage(iIntValue);
                int i10 = this.f15342h;
                int i11 = this.f15348n;
                int i12 = this.f15345k;
                int i13 = (i11 % i12) * i10;
                int i14 = this.f15343i;
                int i15 = ((i11 / i12) % this.f15344j) * i14;
                this.f15350p.set(i13, i15, i10 + i13, i14 + i15);
                w(byteBufferA, inputImage, this.f15340f, this.f15341g, this.f15350p, this.f15351q);
            }
            MediaCodec mediaCodec = this.f15335a;
            int iCapacity = z10 ? 0 : mediaCodec.getInputBuffer(iIntValue).capacity();
            int i16 = this.f15348n;
            this.f15348n = i16 + 1;
            mediaCodec.queueInputBuffer(iIntValue, 0, iCapacity, o(i16), z10 ? 4 : 0);
            if (z10 || this.f15348n % this.f15346l == 0) {
                E(z10);
            }
        }
    }

    public void G() {
        this.f15335a.start();
    }

    public void H() {
        int i10 = this.f15339e;
        if (i10 == 2) {
            this.f15356v.c(0L);
        } else if (i10 == 0) {
            l(null);
        }
    }

    void I() {
        MediaCodec mediaCodec = this.f15335a;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f15335a.release();
            this.f15335a = null;
        }
        synchronized (this.f15353s) {
            this.f15349o = true;
            this.f15353s.notifyAll();
        }
        synchronized (this) {
            m4.a aVar = this.A;
            if (aVar != null) {
                aVar.e(false);
                this.A = null;
            }
            m4.b bVar = this.f15360z;
            if (bVar != null) {
                bVar.h();
                this.f15360z = null;
            }
            SurfaceTexture surfaceTexture = this.f15357w;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f15357w = null;
            }
        }
    }

    public void b(Bitmap bitmap) {
        if (this.f15339e != 2) {
            throw new IllegalStateException("addBitmap is only allowed in bitmap input mode");
        }
        if (this.f15356v.d(o(this.f15348n) * 1000, o((this.f15348n + this.f15346l) - 1))) {
            synchronized (this) {
                m4.b bVar = this.f15360z;
                if (bVar == null) {
                    return;
                }
                bVar.f();
                this.A.d(this.B, bitmap);
                y();
                this.f15360z.g();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f15353s) {
            this.f15349o = true;
            this.f15353s.notifyAll();
        }
        this.f15338d.postAtFrontOfQueue(new b());
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            m4.b bVar = this.f15360z;
            if (bVar == null) {
                return;
            }
            bVar.f();
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.C);
            if (this.f15356v.d(surfaceTexture.getTimestamp(), o((this.f15348n + this.f15346l) - 1))) {
                y();
            }
            surfaceTexture.releaseTexImage();
            this.f15360z.g();
        }
    }
}
