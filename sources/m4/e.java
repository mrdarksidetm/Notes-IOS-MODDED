package m4;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.d;

/* JADX INFO: loaded from: classes.dex */
public final class e implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f15375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f15376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f15377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f15378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f15379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f15380g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    MediaMuxer f15382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m4.d f15383j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int[] f15385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f15386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f15387n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final d f15381h = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final AtomicBoolean f15384k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<Pair<Integer, ByteBuffer>> f15388o = new ArrayList();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.this.w();
            } catch (Exception unused) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FileDescriptor f15391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f15392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f15393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f15394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f15396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f15397h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f15398i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f15399j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Handler f15400k;

        public b(String str, int i10, int i11, int i12) {
            this(str, null, i10, i11, i12);
        }

        private b(String str, FileDescriptor fileDescriptor, int i10, int i11, int i12) {
            this.f15395f = true;
            this.f15396g = 100;
            this.f15397h = 1;
            this.f15398i = 0;
            this.f15399j = 0;
            if (i10 <= 0 || i11 <= 0) {
                throw new IllegalArgumentException("Invalid image size: " + i10 + "x" + i11);
            }
            this.f15390a = str;
            this.f15391b = fileDescriptor;
            this.f15392c = i10;
            this.f15393d = i11;
            this.f15394e = i12;
        }

        public e a() {
            return new e(this.f15390a, this.f15391b, this.f15392c, this.f15393d, this.f15399j, this.f15395f, this.f15396g, this.f15397h, this.f15398i, this.f15394e, this.f15400k);
        }

        public b b(int i10) {
            if (i10 > 0) {
                this.f15397h = i10;
                return this;
            }
            throw new IllegalArgumentException("Invalid maxImage: " + i10);
        }

        public b c(int i10) {
            if (i10 >= 0 && i10 <= 100) {
                this.f15396g = i10;
                return this;
            }
            throw new IllegalArgumentException("Invalid quality: " + i10);
        }
    }

    class c extends d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f15401a;

        c() {
        }

        private void e(Exception exc) {
            if (this.f15401a) {
                return;
            }
            this.f15401a = true;
            e.this.f15381h.a(exc);
        }

        @Override // m4.d.c
        public void a(m4.d dVar) {
            e(null);
        }

        @Override // m4.d.c
        public void b(m4.d dVar, ByteBuffer byteBuffer) {
            if (this.f15401a) {
                return;
            }
            e eVar = e.this;
            if (eVar.f15385l == null) {
                e(new IllegalStateException("Output buffer received before format info"));
                return;
            }
            if (eVar.f15386m < eVar.f15379f * eVar.f15377d) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), 0L, 0);
                e eVar2 = e.this;
                eVar2.f15382i.writeSampleData(eVar2.f15385l[eVar2.f15386m / eVar2.f15377d], byteBuffer, bufferInfo);
            }
            e eVar3 = e.this;
            int i10 = eVar3.f15386m + 1;
            eVar3.f15386m = i10;
            if (i10 == eVar3.f15379f * eVar3.f15377d) {
                e(null);
            }
        }

        @Override // m4.d.c
        public void c(m4.d dVar, MediaCodec.CodecException codecException) {
            e(codecException);
        }

        @Override // m4.d.c
        public void d(m4.d dVar, MediaFormat mediaFormat) {
            if (this.f15401a) {
                return;
            }
            if (e.this.f15385l != null) {
                e(new IllegalStateException("Output format changed after muxer started"));
                return;
            }
            try {
                e.this.f15377d = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
            } catch (ClassCastException | NullPointerException unused) {
                e.this.f15377d = 1;
            }
            e eVar = e.this;
            eVar.f15385l = new int[eVar.f15379f];
            if (eVar.f15378e > 0) {
                Log.d("HeifWriter", "setting rotation: " + e.this.f15378e);
                e eVar2 = e.this;
                eVar2.f15382i.setOrientationHint(eVar2.f15378e);
            }
            int i10 = 0;
            while (true) {
                e eVar3 = e.this;
                if (i10 >= eVar3.f15385l.length) {
                    eVar3.f15382i.start();
                    e.this.f15384k.set(true);
                    e.this.y();
                    return;
                } else {
                    mediaFormat.setInteger("is-default", i10 == eVar3.f15380g ? 1 : 0);
                    e eVar4 = e.this;
                    eVar4.f15385l[i10] = eVar4.f15382i.addTrack(mediaFormat);
                    i10++;
                }
            }
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f15403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Exception f15404b;

        d() {
        }

        synchronized void a(Exception exc) {
            if (!this.f15403a) {
                this.f15403a = true;
                this.f15404b = exc;
                notifyAll();
            }
        }

        synchronized void b(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("timeoutMs is negative");
            }
            if (j10 == 0) {
                while (!this.f15403a) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (!this.f15403a && j10 > 0) {
                    try {
                        wait(j10);
                    } catch (InterruptedException unused2) {
                    }
                    j10 -= System.currentTimeMillis() - jCurrentTimeMillis;
                }
            }
            if (!this.f15403a) {
                this.f15403a = true;
                this.f15404b = new TimeoutException("timed out waiting for result");
            }
            Exception exc = this.f15404b;
            if (exc != null) {
                throw exc;
            }
        }
    }

    e(String str, FileDescriptor fileDescriptor, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, Handler handler) {
        if (i15 >= i14) {
            throw new IllegalArgumentException("Invalid maxImages (" + i14 + ") or primaryIndex (" + i15 + ")");
        }
        MediaFormat.createVideoFormat("image/vnd.android.heic", i10, i11);
        this.f15377d = 1;
        this.f15378e = i12;
        this.f15374a = i16;
        this.f15379f = i14;
        this.f15380g = i15;
        Looper looper = handler != null ? handler.getLooper() : null;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
            this.f15375b = handlerThread;
            handlerThread.start();
            looper = handlerThread.getLooper();
        } else {
            this.f15375b = null;
        }
        Handler handler2 = new Handler(looper);
        this.f15376c = handler2;
        this.f15382i = str != null ? new MediaMuxer(str, 3) : new MediaMuxer(fileDescriptor, 3);
        this.f15383j = new m4.d(i10, i11, z10, i13, i16, handler2, new c());
    }

    private void b(int i10) {
        if (this.f15374a == i10) {
            return;
        }
        throw new IllegalStateException("Not valid in input mode " + this.f15374a);
    }

    private void l(boolean z10) {
        if (this.f15387n != z10) {
            throw new IllegalStateException("Already started");
        }
    }

    private void o(int i10) {
        l(true);
        b(i10);
    }

    public void A() {
        l(false);
        this.f15387n = true;
        this.f15383j.G();
    }

    public void C(long j10) {
        l(true);
        synchronized (this) {
            m4.d dVar = this.f15383j;
            if (dVar != null) {
                dVar.H();
            }
        }
        this.f15381h.b(j10);
        y();
        w();
    }

    public void a(Bitmap bitmap) {
        o(2);
        synchronized (this) {
            m4.d dVar = this.f15383j;
            if (dVar != null) {
                dVar.b(bitmap);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f15376c.postAtFrontOfQueue(new a());
    }

    void w() {
        MediaMuxer mediaMuxer = this.f15382i;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.f15382i.release();
            this.f15382i = null;
        }
        m4.d dVar = this.f15383j;
        if (dVar != null) {
            dVar.close();
            synchronized (this) {
                this.f15383j = null;
            }
        }
    }

    void y() {
        Pair<Integer, ByteBuffer> pairRemove;
        if (!this.f15384k.get()) {
            return;
        }
        while (true) {
            synchronized (this.f15388o) {
                if (this.f15388o.isEmpty()) {
                    return;
                } else {
                    pairRemove = this.f15388o.remove(0);
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(((ByteBuffer) pairRemove.second).position(), ((ByteBuffer) pairRemove.second).remaining(), 0L, 16);
            this.f15382i.writeSampleData(this.f15385l[((Integer) pairRemove.first).intValue()], (ByteBuffer) pairRemove.second, bufferInfo);
        }
    }
}
