package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class a extends View implements qc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageReader f12752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Image f12753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f12754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FlutterRenderer f12755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f12756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12757f;

    /* JADX INFO: renamed from: io.flutter.embedding.android.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0307a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12758a;

        static {
            int[] iArr = new int[b.values().length];
            f12758a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12758a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        background,
        overlay
    }

    public a(Context context, int i10, int i11, b bVar) {
        this(context, h(i10, i11), bVar);
    }

    a(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f12757f = false;
        this.f12752a = imageReader;
        this.f12756e = bVar;
        i();
    }

    private void f() {
        Image image = this.f12753b;
        if (image != null) {
            image.close();
            this.f12753b = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    private static ImageReader h(int i10, int i11) {
        int i12;
        int i13;
        if (i10 <= 0) {
            j("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i10));
            i12 = 1;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            j("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i11));
            i13 = 1;
        } else {
            i13 = i11;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i12, i13, 1, 3, 768L) : ImageReader.newInstance(i12, i13, 1, 3);
    }

    private void i() {
        setAlpha(0.0f);
    }

    private static void j(String str, Object... objArr) {
        cc.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f12753b.getHardwareBuffer();
            this.f12754c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f12753b.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f12753b.getHeight();
        Bitmap bitmap = this.f12754c;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f12754c.getHeight() != height) {
            this.f12754c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f12754c.copyPixelsFromBuffer(buffer);
    }

    @Override // qc.b
    public void a() {
    }

    @Override // qc.b
    public void b(FlutterRenderer flutterRenderer) {
        if (C0307a.f12758a[this.f12756e.ordinal()] == 1) {
            flutterRenderer.C(this.f12752a.getSurface());
        }
        setAlpha(1.0f);
        this.f12755d = flutterRenderer;
        this.f12757f = true;
    }

    @Override // qc.b
    public void c() {
    }

    @Override // qc.b
    public void d() {
        if (this.f12757f) {
            setAlpha(0.0f);
            e();
            this.f12754c = null;
            f();
            invalidate();
            this.f12757f = false;
        }
    }

    public boolean e() {
        if (!this.f12757f) {
            return false;
        }
        Image imageAcquireLatestImage = this.f12752a.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            f();
            this.f12753b = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public void g() {
        this.f12752a.close();
    }

    @Override // qc.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f12755d;
    }

    public ImageReader getImageReader() {
        return this.f12752a;
    }

    public Surface getSurface() {
        return this.f12752a.getSurface();
    }

    public void k(int i10, int i11) {
        if (this.f12755d == null) {
            return;
        }
        if (i10 == this.f12752a.getWidth() && i11 == this.f12752a.getHeight()) {
            return;
        }
        f();
        g();
        this.f12752a = h(i10, i11);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12753b != null) {
            l();
        }
        Bitmap bitmap = this.f12754c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!(i10 == this.f12752a.getWidth() && i11 == this.f12752a.getHeight()) && this.f12756e == b.background && this.f12757f) {
            k(i10, i11);
            this.f12755d.C(this.f12752a.getSurface());
        }
    }
}
