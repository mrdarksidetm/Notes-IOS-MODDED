package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.j;
import ae.r;
import c0.k0;
import l1.j0;
import l1.u1;
import l1.z;

/* JADX INFO: loaded from: classes2.dex */
public final class Fade implements PlaceholderHighlight {
    private final k0<Float> animationSpec;
    private final u1 brush;
    private final long highlightColor;

    private Fade(long j10, k0<Float> k0Var) {
        r.f(k0Var, "animationSpec");
        this.highlightColor = j10;
        this.animationSpec = k0Var;
        this.brush = new u1(j10, null);
    }

    public /* synthetic */ Fade(long j10, k0 k0Var, j jVar) {
        this(j10, k0Var);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    private final long m145component10d7_KjU() {
        return this.highlightColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ Fade m146copyDxMtmZc$default(Fade fade, long j10, k0 k0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = fade.highlightColor;
        }
        if ((i10 & 2) != 0) {
            k0Var = fade.animationSpec;
        }
        return fade.m148copyDxMtmZc(j10, k0Var);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    public float alpha(float f10) {
        return f10;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    /* JADX INFO: renamed from: brush-d16Qtg0, reason: not valid java name */
    public z mo147brushd16Qtg0(float f10, long j10) {
        return this.brush;
    }

    public final k0<Float> component2() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: copy-DxMtmZc, reason: not valid java name */
    public final Fade m148copyDxMtmZc(long j10, k0<Float> k0Var) {
        r.f(k0Var, "animationSpec");
        return new Fade(j10, k0Var, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return j0.w(this.highlightColor, fade.highlightColor) && r.b(this.animationSpec, fade.animationSpec);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    public k0<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (j0.C(this.highlightColor) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Fade(highlightColor=" + ((Object) j0.D(this.highlightColor)) + ", animationSpec=" + this.animationSpec + ')';
    }
}
