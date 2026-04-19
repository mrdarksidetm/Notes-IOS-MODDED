package wc;

import android.annotation.TargetApi;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(29)
public class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextureRegistry.ImageTextureEntry f22848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageReader f22849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22850c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22851d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f22852e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageReader.OnImageAvailableListener f22853f = new C0473a();

    /* JADX INFO: renamed from: wc.a$a, reason: collision with other inner class name */
    class C0473a implements ImageReader.OnImageAvailableListener {
        C0473a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage;
            try {
                imageAcquireLatestImage = imageReader.acquireLatestImage();
            } catch (IllegalStateException e10) {
                cc.b.b("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e10.toString());
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return;
            }
            a.this.f22848a.pushImage(imageAcquireLatestImage);
        }
    }

    public a(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f22848a = imageTextureEntry;
    }

    private void c() {
        if (this.f22849b != null) {
            this.f22848a.pushImage(null);
            this.f22849b.close();
            this.f22849b = null;
        }
    }

    @Override // wc.j
    public void a(int i10, int i11) {
        if (this.f22849b != null && this.f22850c == i10 && this.f22851d == i11) {
            return;
        }
        c();
        this.f22850c = i10;
        this.f22851d = i11;
        this.f22849b = d();
    }

    protected ImageReader d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return f();
        }
        if (i10 >= 29) {
            return e();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @TargetApi(29)
    protected ImageReader e() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(this.f22850c, this.f22851d, 34, 4, 256L);
        imageReaderNewInstance.setOnImageAvailableListener(this.f22853f, this.f22852e);
        return imageReaderNewInstance;
    }

    @TargetApi(R.styleable.AppCompatTheme_actionOverflowMenuStyle)
    protected ImageReader f() {
        ImageReader.Builder builder = new ImageReader.Builder(this.f22850c, this.f22851d);
        builder.setMaxImages(4);
        builder.setImageFormat(34);
        builder.setUsage(256L);
        ImageReader imageReaderBuild = builder.build();
        imageReaderBuild.setOnImageAvailableListener(this.f22853f, this.f22852e);
        return imageReaderBuild;
    }

    @Override // wc.j
    public int getHeight() {
        return this.f22851d;
    }

    @Override // wc.j
    public long getId() {
        return this.f22848a.id();
    }

    @Override // wc.j
    public Surface getSurface() {
        return this.f22849b.getSurface();
    }

    @Override // wc.j
    public int getWidth() {
        return this.f22850c;
    }

    @Override // wc.j
    public void release() {
        c();
        this.f22848a = null;
    }
}
