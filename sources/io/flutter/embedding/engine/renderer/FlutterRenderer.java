package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.n;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class FlutterRenderer implements TextureRegistry {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f12911i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f12912j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f12913a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Surface f12915c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qc.a f12920h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f12914b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12916d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f12917e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<WeakReference<TextureRegistry.b>> f12918f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<ImageReaderSurfaceProducer> f12919g = new ArrayList();

    @Keep
    @TargetApi(29)
    final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f12921id;
        private boolean released;
        private boolean ignoringFence = false;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque<b> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, b> perImageReaders = new HashMap<>();
        private a lastDequeuedImage = null;
        private b lastReaderDequeuedFrom = null;
        private TextureRegistry.SurfaceProducer.a callback = null;

        private class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Image f12922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f12923b;

            public a(Image image, long j10) {
                this.f12922a = image;
                this.f12923b = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ImageReader f12925a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ArrayDeque<a> f12926b = new ArrayDeque<>();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f12927c = false;

            public b(ImageReader imageReader) {
                this.f12925a = imageReader;
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.a
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        this.f12971a.f(imageReader2);
                    }
                }, new Handler(Looper.getMainLooper()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(ImageReader imageReader) {
                Image imageAcquireLatestImage;
                try {
                    imageAcquireLatestImage = imageReader.acquireLatestImage();
                } catch (IllegalStateException e10) {
                    cc.b.b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e10);
                    imageAcquireLatestImage = null;
                }
                if (imageAcquireLatestImage == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || this.f12927c) {
                    imageAcquireLatestImage.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, imageAcquireLatestImage);
                }
            }

            boolean c() {
                return this.f12926b.isEmpty() && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            void d() {
                this.f12927c = true;
                this.f12925a.close();
                this.f12926b.clear();
            }

            a e() {
                if (this.f12926b.isEmpty()) {
                    return null;
                }
                return this.f12926b.removeFirst();
            }

            a g(Image image) {
                if (this.f12927c) {
                    return null;
                }
                a aVar = ImageReaderSurfaceProducer.this.new a(image, System.nanoTime());
                this.f12926b.add(aVar);
                while (this.f12926b.size() > 2) {
                    this.f12926b.removeFirst().f12922a.close();
                }
                return aVar;
            }
        }

        ImageReaderSurfaceProducer(long j10) {
            this.f12921id = j10;
        }

        private void cleanup() {
            synchronized (this.lock) {
                for (b bVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == bVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    bVar.d();
                }
                this.perImageReaders.clear();
                a aVar = this.lastDequeuedImage;
                if (aVar != null) {
                    aVar.f12922a.close();
                    this.lastDequeuedImage = null;
                }
                b bVar2 = this.lastReaderDequeuedFrom;
                if (bVar2 != null) {
                    bVar2.d();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            }
        }

        private ImageReader createImageReader() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return createImageReader33();
            }
            if (i10 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(29)
        private ImageReader createImageReader29() {
            return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
        }

        @TargetApi(R.styleable.AppCompatTheme_actionOverflowMenuStyle)
        private ImageReader createImageReader33() {
            ImageReader.Builder builder = new ImageReader.Builder(this.requestedWidth, this.requestedHeight);
            builder.setMaxImages(5);
            builder.setImageFormat(34);
            builder.setUsage(256L);
            return builder.build();
        }

        private b getActiveReader() {
            synchronized (this.lock) {
                if (!this.createNewReader) {
                    return this.imageReaderQueue.peekLast();
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                cc.b.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.f12919g.remove(this);
        }

        @TargetApi(R.styleable.AppCompatTheme_actionOverflowMenuStyle)
        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            a aVarDequeueImage = dequeueImage();
            if (aVarDequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(aVarDequeueImage.f12922a);
            return aVarDequeueImage.f12922a;
        }

        double deltaMillis(long j10) {
            return j10 / 1000000.0d;
        }

        a dequeueImage() {
            a aVar;
            synchronized (this.lock) {
                Iterator<b> it = this.imageReaderQueue.iterator();
                aVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b next = it.next();
                    a aVarE = next.e();
                    if (aVarE == null) {
                        aVar = aVarE;
                    } else {
                        a aVar2 = this.lastDequeuedImage;
                        if (aVar2 != null) {
                            aVar2.f12922a.close();
                        }
                        this.lastDequeuedImage = aVarE;
                        this.lastReaderDequeuedFrom = next;
                        aVar = aVarE;
                    }
                }
                pruneImageReaderQueue();
            }
            return aVar;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.f12917e.post(new g(this.f12921id, FlutterRenderer.this.f12913a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        b getOrCreatePerImageReader(ImageReader imageReader) {
            b bVar = this.perImageReaders.get(imageReader);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(imageReader);
            this.perImageReaders.put(imageReader, bVar2);
            this.imageReaderQueue.add(bVar2);
            return bVar2;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().f12925a.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public long id() {
            return this.f12921id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int size;
            synchronized (this.lock) {
                Iterator<b> it = this.imageReaderQueue.iterator();
                size = 0;
                while (it.hasNext()) {
                    size += it.next().f12926b.size();
                }
            }
            return size;
        }

        public int numTrims() {
            int i10;
            synchronized (this.lock) {
                i10 = this.numTrims;
            }
            return i10;
        }

        void onImage(ImageReader imageReader, Image image) {
            a aVarG;
            synchronized (this.lock) {
                aVarG = getOrCreatePerImageReader(imageReader).g(image);
            }
            if (aVarG == null) {
                return;
            }
            FlutterRenderer.this.w();
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i10) {
            if (i10 < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            cleanup();
            this.createNewReader = true;
            TextureRegistry.SurfaceProducer.a aVar = this.callback;
            if (aVar != null) {
                aVar.b();
            }
        }

        void pruneImageReaderQueue() {
            b bVarPeekFirst;
            while (this.imageReaderQueue.size() > 1 && (bVarPeekFirst = this.imageReaderQueue.peekFirst()) != null && bVarPeekFirst.c()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(bVarPeekFirst.f12925a);
                bVarPeekFirst.d();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.D(this.f12921id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.w();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
            this.callback = aVar;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i10, int i11) {
            int iMax = Math.max(1, i10);
            int iMax2 = Math.max(1, i11);
            if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = iMax2;
            this.requestedWidth = iMax;
        }
    }

    @Keep
    final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f12929id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        ImageTextureRegistryEntry(long j10) {
            this.f12929id = j10;
        }

        @TargetApi(29)
        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                cc.b.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        @TargetApi(R.styleable.AppCompatTheme_actionOverflowMenuStyle)
        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f12917e.post(new g(this.f12929id, FlutterRenderer.this.f12913a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public long id() {
            return this.f12929id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                cc.b.b(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.w();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.D(this.f12929id);
        }
    }

    class a implements qc.a {
        a() {
        }

        @Override // qc.a
        public void b() {
            FlutterRenderer.this.f12916d = false;
        }

        @Override // qc.a
        public void e() {
            FlutterRenderer.this.f12916d = true;
        }
    }

    class b implements DefaultLifecycleObserver {
        b() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(o4.e eVar) {
            cc.b.f("FlutterRenderer", "onResume called; notifying SurfaceProducers");
            for (ImageReaderSurfaceProducer imageReaderSurfaceProducer : FlutterRenderer.this.f12919g) {
                if (imageReaderSurfaceProducer.callback != null) {
                    imageReaderSurfaceProducer.callback.a();
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f12932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f12933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f12934c;

        public c(Rect rect, e eVar) {
            this.f12932a = rect;
            this.f12933b = eVar;
            this.f12934c = d.UNKNOWN;
        }

        public c(Rect rect, e eVar, d dVar) {
            this.f12932a = rect;
            this.f12933b = eVar;
            this.f12934c = dVar;
        }
    }

    public enum d {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12939a;

        d(int i10) {
            this.f12939a = i10;
        }
    }

    public enum e {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12945a;

        e(int i10) {
            this.f12945a = i10;
        }
    }

    final class f implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f12946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SurfaceTextureWrapper f12947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextureRegistry.b f12949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextureRegistry.a f12950e;

        f(long j10, SurfaceTexture surfaceTexture) {
            this.f12946a = j10;
            this.f12947b = new SurfaceTextureWrapper(surfaceTexture, new Runnable() { // from class: io.flutter.embedding.engine.renderer.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12972a.c();
                }
            });
            surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.c
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    this.f12973a.d(surfaceTexture2);
                }
            }, new Handler());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            TextureRegistry.a aVar = this.f12950e;
            if (aVar != null) {
                aVar.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(SurfaceTexture surfaceTexture) {
            if (this.f12948c || !FlutterRenderer.this.f12913a.isAttached()) {
                return;
            }
            this.f12947b.markDirty();
            FlutterRenderer.this.w();
        }

        private void e() {
            FlutterRenderer.this.v(this);
        }

        public SurfaceTextureWrapper f() {
            return this.f12947b;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.f12948c) {
                    return;
                }
                FlutterRenderer.this.f12917e.post(new g(this.f12946a, FlutterRenderer.this.f12913a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public long id() {
            return this.f12946a;
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i10) {
            TextureRegistry.b bVar = this.f12949d;
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void release() {
            if (this.f12948c) {
                return;
            }
            cc.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f12946a + ").");
            this.f12947b.release();
            FlutterRenderer.this.D(this.f12946a);
            e();
            this.f12948c = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(TextureRegistry.a aVar) {
            this.f12950e = aVar;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(TextureRegistry.b bVar) {
            this.f12949d = bVar;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public SurfaceTexture surfaceTexture() {
            return this.f12947b.surfaceTexture();
        }
    }

    static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f12952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FlutterJNI f12953b;

        g(long j10, FlutterJNI flutterJNI) {
            this.f12952a = j10;
            this.f12953b = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12953b.isAttached()) {
                cc.b.f("FlutterRenderer", "Releasing a Texture (" + this.f12952a + ").");
                this.f12953b.unregisterTexture(this.f12952a);
            }
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f12954a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12955b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12956c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12957d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12958e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12959f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12960g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f12961h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f12962i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f12963j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f12964k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f12965l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f12966m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f12967n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f12968o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f12969p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<c> f12970q = new ArrayList();

        boolean a() {
            return this.f12955b > 0 && this.f12956c > 0 && this.f12954a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f12920h = aVar;
        this.f12913a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        n.l().getLifecycle().a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(long j10) {
        this.f12913a.unregisterTexture(j10);
    }

    private void l() {
        Iterator<WeakReference<TextureRegistry.b>> it = this.f12918f.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    private void q(long j10, TextureRegistry.ImageConsumer imageConsumer) {
        this.f12913a.registerImageTexture(j10, imageConsumer);
    }

    private TextureRegistry.SurfaceTextureEntry r(long j10, SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(j10, surfaceTexture);
        cc.b.f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.id());
        t(fVar.id(), fVar.f());
        k(fVar);
        return fVar;
    }

    private void t(long j10, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f12913a.registerTexture(j10, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.f12913a.scheduleFrame();
    }

    public void A() {
        if (this.f12915c != null) {
            this.f12913a.onSurfaceDestroyed();
            if (this.f12916d) {
                this.f12920h.b();
            }
            this.f12916d = false;
            this.f12915c = null;
        }
    }

    public void B(int i10, int i11) {
        this.f12913a.onSurfaceChanged(i10, i11);
    }

    public void C(Surface surface) {
        this.f12915c = surface;
        this.f12913a.onSurfaceWindowChanged(surface);
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.ImageTextureEntry a() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.f12914b.getAndIncrement());
        cc.b.f("FlutterRenderer", "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        q(imageTextureRegistryEntry.id(), imageTextureRegistryEntry);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceProducer b() {
        if (f12911i || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntryC = c();
            io.flutter.embedding.engine.renderer.d dVar = new io.flutter.embedding.engine.renderer.d(surfaceTextureEntryC.id(), this.f12917e, this.f12913a, surfaceTextureEntryC);
            cc.b.f("FlutterRenderer", "New SurfaceTextureSurfaceProducer ID: " + surfaceTextureEntryC.id());
            return dVar;
        }
        long andIncrement = this.f12914b.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        q(andIncrement, imageReaderSurfaceProducer);
        k(imageReaderSurfaceProducer);
        this.f12919g.add(imageReaderSurfaceProducer);
        cc.b.f("FlutterRenderer", "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceTextureEntry c() {
        cc.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return s(new SurfaceTexture(0));
    }

    public void j(qc.a aVar) {
        this.f12913a.addIsDisplayingFlutterUiListener(aVar);
        if (this.f12916d) {
            aVar.e();
        }
    }

    void k(TextureRegistry.b bVar) {
        l();
        this.f12918f.add(new WeakReference<>(bVar));
    }

    public void m(ByteBuffer byteBuffer, int i10) {
        this.f12913a.dispatchPointerDataPacket(byteBuffer, i10);
    }

    public boolean n() {
        return this.f12916d;
    }

    public boolean o() {
        return this.f12913a.getIsSoftwareRenderingEnabled();
    }

    public void p(int i10) {
        Iterator<WeakReference<TextureRegistry.b>> it = this.f12918f.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    public TextureRegistry.SurfaceTextureEntry s(SurfaceTexture surfaceTexture) {
        return r(this.f12914b.getAndIncrement(), surfaceTexture);
    }

    public void u(qc.a aVar) {
        this.f12913a.removeIsDisplayingFlutterUiListener(aVar);
    }

    void v(TextureRegistry.b bVar) {
        for (WeakReference<TextureRegistry.b> weakReference : this.f12918f) {
            if (weakReference.get() == bVar) {
                this.f12918f.remove(weakReference);
                return;
            }
        }
    }

    public void x(boolean z10) {
        this.f12913a.setSemanticsEnabled(z10);
    }

    public void y(h hVar) {
        if (hVar.a()) {
            cc.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + hVar.f12955b + " x " + hVar.f12956c + "\nPadding - L: " + hVar.f12960g + ", T: " + hVar.f12957d + ", R: " + hVar.f12958e + ", B: " + hVar.f12959f + "\nInsets - L: " + hVar.f12964k + ", T: " + hVar.f12961h + ", R: " + hVar.f12962i + ", B: " + hVar.f12963j + "\nSystem Gesture Insets - L: " + hVar.f12968o + ", T: " + hVar.f12965l + ", R: " + hVar.f12966m + ", B: " + hVar.f12966m + "\nDisplay Features: " + hVar.f12970q.size());
            int[] iArr = new int[hVar.f12970q.size() * 4];
            int[] iArr2 = new int[hVar.f12970q.size()];
            int[] iArr3 = new int[hVar.f12970q.size()];
            for (int i10 = 0; i10 < hVar.f12970q.size(); i10++) {
                c cVar = hVar.f12970q.get(i10);
                int i11 = i10 * 4;
                Rect rect = cVar.f12932a;
                iArr[i11] = rect.left;
                iArr[i11 + 1] = rect.top;
                iArr[i11 + 2] = rect.right;
                iArr[i11 + 3] = rect.bottom;
                iArr2[i10] = cVar.f12933b.f12945a;
                iArr3[i10] = cVar.f12934c.f12939a;
            }
            this.f12913a.setViewportMetrics(hVar.f12954a, hVar.f12955b, hVar.f12956c, hVar.f12957d, hVar.f12958e, hVar.f12959f, hVar.f12960g, hVar.f12961h, hVar.f12962i, hVar.f12963j, hVar.f12964k, hVar.f12965l, hVar.f12966m, hVar.f12967n, hVar.f12968o, hVar.f12969p, iArr, iArr2, iArr3);
        }
    }

    public void z(Surface surface, boolean z10) {
        if (!z10) {
            A();
        }
        this.f12915c = surface;
        if (z10) {
            this.f12913a.onSurfaceWindowChanged(surface);
        } else {
            this.f12913a.onSurfaceCreated(surface);
        }
    }
}
