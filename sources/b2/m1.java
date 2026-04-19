package b2;

import android.view.RenderNode;

/* JADX INFO: loaded from: classes.dex */
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f5375a = new m1();

    private m1() {
    }

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
