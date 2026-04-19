package m4;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EGLDisplay f15328a = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLContext f15329b = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLSurface f15330c = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLConfig[] f15331d = new EGLConfig[1];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f15332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15334g;

    public b(Surface surface) {
        surface.getClass();
        this.f15332e = surface;
        c();
    }

    private void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    private void b() {
        this.f15330c = EGL14.eglCreateWindowSurface(this.f15328a, this.f15331d[0], this.f15332e, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
        if (this.f15330c == null) {
            throw new RuntimeException("surface was null");
        }
    }

    private void c() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f15328a = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f15328a, iArr, 0, iArr, 1)) {
            this.f15328a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLDisplay eGLDisplay = this.f15328a;
        EGLConfig[] eGLConfigArr = this.f15331d;
        if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.f15329b = EGL14.eglCreateContext(this.f15328a, this.f15331d[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        a("eglCreateContext");
        if (this.f15329b == null) {
            throw new RuntimeException("null context");
        }
        b();
        this.f15333f = e();
        this.f15334g = d();
    }

    public int d() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f15328a, this.f15330c, 12374, iArr, 0);
        return iArr[0];
    }

    public int e() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f15328a, this.f15330c, 12375, iArr, 0);
        return iArr[0];
    }

    public void f() {
        EGLDisplay eGLDisplay = this.f15328a;
        EGLSurface eGLSurface = this.f15330c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f15329b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void g() {
        EGLDisplay eGLDisplay = this.f15328a;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void h() {
        if (!Objects.equals(this.f15328a, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglDestroySurface(this.f15328a, this.f15330c);
            EGL14.eglDestroyContext(this.f15328a, this.f15329b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f15328a);
        }
        this.f15332e.release();
        this.f15328a = EGL14.EGL_NO_DISPLAY;
        this.f15329b = EGL14.EGL_NO_CONTEXT;
        this.f15330c = EGL14.EGL_NO_SURFACE;
        this.f15332e = null;
    }

    public void i(long j10) {
        EGLExt.eglPresentationTimeANDROID(this.f15328a, this.f15330c, j10);
    }

    public boolean j() {
        return EGL14.eglSwapBuffers(this.f15328a, this.f15330c);
    }
}
