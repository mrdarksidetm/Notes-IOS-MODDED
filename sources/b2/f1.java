package b2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.b;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f5248l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.i f5250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RenderNode f5251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l1.n1 f5257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f5246j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f5247k = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f5249m = true;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public f1(androidx.compose.ui.platform.i iVar) {
        this.f5250a = iVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", iVar);
        this.f5251b = renderNodeCreate;
        this.f5252c = androidx.compose.ui.graphics.b.f2766a.a();
        if (f5249m) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            P(renderNodeCreate);
            K();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f5249m = false;
        }
        if (f5248l) {
            throw new NoClassDefFoundError();
        }
    }

    private final void K() {
        l1.f5373a.a(this.f5251b);
    }

    private final void P(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            m1 m1Var = m1.f5375a;
            m1Var.c(renderNode, m1Var.a(renderNode));
            m1Var.d(renderNode, m1Var.b(renderNode));
        }
    }

    @Override // b2.m0
    public void A(Outline outline) {
        this.f5251b.setOutline(outline);
    }

    @Override // b2.m0
    public boolean B() {
        return this.f5258i;
    }

    @Override // b2.m0
    public int C() {
        return this.f5254e;
    }

    @Override // b2.m0
    public void D(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            m1.f5375a.c(this.f5251b, i10);
        }
    }

    @Override // b2.m0
    public boolean E() {
        return this.f5251b.getClipToOutline();
    }

    @Override // b2.m0
    public void F(boolean z10) {
        this.f5251b.setClipToOutline(z10);
    }

    @Override // b2.m0
    public boolean G(boolean z10) {
        return this.f5251b.setHasOverlappingRendering(z10);
    }

    @Override // b2.m0
    public void H(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            m1.f5375a.d(this.f5251b, i10);
        }
    }

    @Override // b2.m0
    public void I(Matrix matrix) {
        this.f5251b.getMatrix(matrix);
    }

    @Override // b2.m0
    public float J() {
        return this.f5251b.getElevation();
    }

    public void L(int i10) {
        this.f5256g = i10;
    }

    public void M(int i10) {
        this.f5253d = i10;
    }

    public void N(int i10) {
        this.f5255f = i10;
    }

    public void O(int i10) {
        this.f5254e = i10;
    }

    @Override // b2.m0
    public float a() {
        return this.f5251b.getAlpha();
    }

    @Override // b2.m0
    public void b(float f10) {
        this.f5251b.setAlpha(f10);
    }

    @Override // b2.m0
    public int c() {
        return this.f5253d;
    }

    @Override // b2.m0
    public void d(int i10) {
        M(c() + i10);
        N(f() + i10);
        this.f5251b.offsetLeftAndRight(i10);
    }

    @Override // b2.m0
    public void e(float f10) {
        this.f5251b.setRotationY(f10);
    }

    @Override // b2.m0
    public int f() {
        return this.f5255f;
    }

    @Override // b2.m0
    public int g() {
        return this.f5256g;
    }

    @Override // b2.m0
    public int getHeight() {
        return g() - C();
    }

    @Override // b2.m0
    public int getWidth() {
        return f() - c();
    }

    @Override // b2.m0
    public void h(float f10) {
        this.f5251b.setRotation(f10);
    }

    @Override // b2.m0
    public void i(float f10) {
        this.f5251b.setTranslationY(f10);
    }

    @Override // b2.m0
    public void j(Canvas canvas) {
        ae.r.d(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f5251b);
    }

    @Override // b2.m0
    public void k(float f10) {
        this.f5251b.setPivotX(f10);
    }

    @Override // b2.m0
    public void l(boolean z10) {
        this.f5258i = z10;
        this.f5251b.setClipToBounds(z10);
    }

    @Override // b2.m0
    public void m(float f10) {
        this.f5251b.setScaleY(f10);
    }

    @Override // b2.m0
    public void n(l1.n1 n1Var) {
        this.f5257h = n1Var;
    }

    @Override // b2.m0
    public void o(int i10) {
        int i11;
        RenderNode renderNode;
        b.a aVar = androidx.compose.ui.graphics.b.f2766a;
        if (androidx.compose.ui.graphics.b.e(i10, aVar.c())) {
            renderNode = this.f5251b;
            i11 = 2;
        } else {
            i11 = 0;
            if (androidx.compose.ui.graphics.b.e(i10, aVar.b())) {
                this.f5251b.setLayerType(0);
                this.f5251b.setHasOverlappingRendering(false);
                this.f5252c = i10;
            }
            renderNode = this.f5251b;
        }
        renderNode.setLayerType(i11);
        this.f5251b.setHasOverlappingRendering(true);
        this.f5252c = i10;
    }

    @Override // b2.m0
    public boolean p(int i10, int i11, int i12, int i13) {
        M(i10);
        O(i11);
        N(i12);
        L(i13);
        return this.f5251b.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // b2.m0
    public void q() {
        K();
    }

    @Override // b2.m0
    public void r(l1.c0 c0Var, l1.f1 f1Var, zd.l<? super l1.b0, md.i0> lVar) {
        DisplayListCanvas displayListCanvasStart = this.f5251b.start(getWidth(), getHeight());
        Canvas canvasW = c0Var.a().w();
        c0Var.a().x((Canvas) displayListCanvasStart);
        l1.b bVarA = c0Var.a();
        if (f1Var != null) {
            bVarA.h();
            l1.b0.m(bVarA, f1Var, 0, 2, null);
        }
        lVar.invoke(bVarA);
        if (f1Var != null) {
            bVarA.p();
        }
        c0Var.a().x(canvasW);
        this.f5251b.end(displayListCanvasStart);
    }

    @Override // b2.m0
    public void s(float f10) {
        this.f5251b.setPivotY(f10);
    }

    @Override // b2.m0
    public void t(float f10) {
        this.f5251b.setScaleX(f10);
    }

    @Override // b2.m0
    public void u(float f10) {
        this.f5251b.setTranslationX(f10);
    }

    @Override // b2.m0
    public void v(float f10) {
        this.f5251b.setElevation(f10);
    }

    @Override // b2.m0
    public void w(int i10) {
        O(C() + i10);
        L(g() + i10);
        this.f5251b.offsetTopAndBottom(i10);
    }

    @Override // b2.m0
    public boolean x() {
        return this.f5251b.isValid();
    }

    @Override // b2.m0
    public void y(float f10) {
        this.f5251b.setCameraDistance(-f10);
    }

    @Override // b2.m0
    public void z(float f10) {
        this.f5251b.setRotationX(f10);
    }
}
