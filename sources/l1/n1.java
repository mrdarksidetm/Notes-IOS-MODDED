package l1;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RenderEffect f14559a;

    private n1() {
    }

    public /* synthetic */ n1(ae.j jVar) {
        this();
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.f14559a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.f14559a = renderEffectB;
        return renderEffectB;
    }

    protected abstract RenderEffect b();
}
