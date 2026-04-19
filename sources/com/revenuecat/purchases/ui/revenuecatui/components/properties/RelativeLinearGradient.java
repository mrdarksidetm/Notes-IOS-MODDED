package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.j;
import ae.r;
import android.graphics.Shader;
import java.util.List;
import k1.f;
import k1.g;
import k1.l;
import l1.j0;
import l1.q1;
import l1.r1;
import l1.x1;

/* JADX INFO: loaded from: classes2.dex */
final class RelativeLinearGradient extends q1 {
    private final List<j0> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    private RelativeLinearGradient(List<j0> list, List<Float> list2, long j10, long j11, int i10) {
        r.f(list, "colors");
        this.colors = list;
        this.stops = list2;
        this.start = j10;
        this.end = j11;
        this.tileMode = i10;
        float fO = f.o(j10);
        if (!(0.0f <= fO && fO <= 1.0f)) {
            throw new IllegalArgumentException(("Coordinates must be between 0 and 1 (inclusive). `start.x` is " + f.o(j10)).toString());
        }
        float fP = f.p(j10);
        if (!(0.0f <= fP && fP <= 1.0f)) {
            throw new IllegalArgumentException(("Coordinates must be between 0 and 1 (inclusive). `start.y` is " + f.p(j10)).toString());
        }
        float fO2 = f.o(j11);
        if (!(0.0f <= fO2 && fO2 <= 1.0f)) {
            throw new IllegalArgumentException(("Coordinates must be between 0 and 1 (inclusive). `end.x` is " + f.o(j11)).toString());
        }
        float fP2 = f.p(j11);
        if (0.0f <= fP2 && fP2 <= 1.0f) {
            return;
        }
        throw new IllegalArgumentException(("Coordinates must be between 0 and 1 (inclusive). `end.y` is " + f.p(j11)).toString());
    }

    public /* synthetic */ RelativeLinearGradient(List list, List list2, long j10, long j11, int i10, int i11, j jVar) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, j11, (i11 & 16) != 0 ? x1.f14638a.a() : i10, null);
    }

    public /* synthetic */ RelativeLinearGradient(List list, List list2, long j10, long j11, int i10, j jVar) {
        this(list, list2, j10, j11, i10);
    }

    @Override // l1.q1
    /* JADX INFO: renamed from: createShader-uvyYCjk, reason: not valid java name */
    public Shader mo129createShaderuvyYCjk(long j10) {
        return r1.a(g.a(f.o(this.start) * l.i(j10), f.p(this.start) * l.g(j10)), g.a(f.o(this.end) * l.i(j10), f.p(this.end) * l.g(j10)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativeLinearGradient)) {
            return false;
        }
        RelativeLinearGradient relativeLinearGradient = (RelativeLinearGradient) obj;
        return r.b(this.colors, relativeLinearGradient.colors) && r.b(this.stops, relativeLinearGradient.stops) && f.l(this.start, relativeLinearGradient.start) && f.l(this.end, relativeLinearGradient.end) && x1.f(this.tileMode, relativeLinearGradient.tileMode);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + f.q(this.start)) * 31) + f.q(this.end)) * 31) + x1.g(this.tileMode);
    }

    public String toString() {
        return "RelativeLinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", start=" + ((Object) f.v(this.start)) + ", end=" + ((Object) f.v(this.end)) + ", tileMode=" + ((Object) x1.h(this.tileMode)) + ')';
    }
}
