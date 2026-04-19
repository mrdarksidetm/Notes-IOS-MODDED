package b2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.b;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.i f5266a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1.n1 f5268c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RenderNode f5267b = new RenderNode("Compose");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5269d = androidx.compose.ui.graphics.b.f2766a.a();

    public h1(androidx.compose.ui.platform.i iVar) {
        this.f5266a = iVar;
    }

    @Override // b2.m0
    public void A(Outline outline) {
        this.f5267b.setOutline(outline);
    }

    @Override // b2.m0
    public boolean B() {
        return this.f5267b.getClipToBounds();
    }

    @Override // b2.m0
    public int C() {
        return this.f5267b.getTop();
    }

    @Override // b2.m0
    public void D(int i10) {
        this.f5267b.setAmbientShadowColor(i10);
    }

    @Override // b2.m0
    public boolean E() {
        return this.f5267b.getClipToOutline();
    }

    @Override // b2.m0
    public void F(boolean z10) {
        this.f5267b.setClipToOutline(z10);
    }

    @Override // b2.m0
    public boolean G(boolean z10) {
        return this.f5267b.setHasOverlappingRendering(z10);
    }

    @Override // b2.m0
    public void H(int i10) {
        this.f5267b.setSpotShadowColor(i10);
    }

    @Override // b2.m0
    public void I(Matrix matrix) {
        this.f5267b.getMatrix(matrix);
    }

    @Override // b2.m0
    public float J() {
        return this.f5267b.getElevation();
    }

    @Override // b2.m0
    public float a() {
        return this.f5267b.getAlpha();
    }

    @Override // b2.m0
    public void b(float f10) {
        this.f5267b.setAlpha(f10);
    }

    @Override // b2.m0
    public int c() {
        return this.f5267b.getLeft();
    }

    @Override // b2.m0
    public void d(int i10) {
        this.f5267b.offsetLeftAndRight(i10);
    }

    @Override // b2.m0
    public void e(float f10) {
        this.f5267b.setRotationY(f10);
    }

    @Override // b2.m0
    public int f() {
        return this.f5267b.getRight();
    }

    @Override // b2.m0
    public int g() {
        return this.f5267b.getBottom();
    }

    @Override // b2.m0
    public int getHeight() {
        return this.f5267b.getHeight();
    }

    @Override // b2.m0
    public int getWidth() {
        return this.f5267b.getWidth();
    }

    @Override // b2.m0
    public void h(float f10) {
        this.f5267b.setRotationZ(f10);
    }

    @Override // b2.m0
    public void i(float f10) {
        this.f5267b.setTranslationY(f10);
    }

    @Override // b2.m0
    public void j(Canvas canvas) {
        canvas.drawRenderNode(this.f5267b);
    }

    @Override // b2.m0
    public void k(float f10) {
        this.f5267b.setPivotX(f10);
    }

    @Override // b2.m0
    public void l(boolean z10) {
        this.f5267b.setClipToBounds(z10);
    }

    @Override // b2.m0
    public void m(float f10) {
        this.f5267b.setScaleY(f10);
    }

    @Override // b2.m0
    public void n(l1.n1 n1Var) {
        this.f5268c = n1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            j1.f5311a.a(this.f5267b, n1Var);
        }
    }

    @Override // b2.m0
    public void o(int i10) {
        RenderNode renderNode = this.f5267b;
        b.a aVar = androidx.compose.ui.graphics.b.f2766a;
        if (!androidx.compose.ui.graphics.b.e(i10, aVar.c())) {
            boolean zE = androidx.compose.ui.graphics.b.e(i10, aVar.b());
            renderNode.setUseCompositingLayer(false, null);
            if (zE) {
                renderNode.setHasOverlappingRendering(false);
            }
            this.f5269d = i10;
        }
        renderNode.setUseCompositingLayer(true, null);
        renderNode.setHasOverlappingRendering(true);
        this.f5269d = i10;
    }

    @Override // b2.m0
    public boolean p(int i10, int i11, int i12, int i13) {
        return this.f5267b.setPosition(i10, i11, i12, i13);
    }

    @Override // b2.m0
    public void q() {
        this.f5267b.discardDisplayList();
    }

    @Override // b2.m0
    public void r(l1.c0 c0Var, l1.f1 f1Var, zd.l<? super l1.b0, md.i0> lVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f5267b.beginRecording();
        Canvas canvasW = c0Var.a().w();
        c0Var.a().x(recordingCanvasBeginRecording);
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
        this.f5267b.endRecording();
    }

    @Override // b2.m0
    public void s(float f10) {
        this.f5267b.setPivotY(f10);
    }

    @Override // b2.m0
    public void t(float f10) {
        this.f5267b.setScaleX(f10);
    }

    @Override // b2.m0
    public void u(float f10) {
        this.f5267b.setTranslationX(f10);
    }

    @Override // b2.m0
    public void v(float f10) {
        this.f5267b.setElevation(f10);
    }

    @Override // b2.m0
    public void w(int i10) {
        this.f5267b.offsetTopAndBottom(i10);
    }

    @Override // b2.m0
    public boolean x() {
        return this.f5267b.hasDisplayList();
    }

    @Override // b2.m0
    public void y(float f10) {
        this.f5267b.setCameraDistance(f10);
    }

    @Override // b2.m0
    public void z(float f10) {
        this.f5267b.setRotationX(f10);
    }
}
