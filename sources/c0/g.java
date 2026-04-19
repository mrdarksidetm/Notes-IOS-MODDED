package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public final class g<T, V extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k<T, V> f6043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f6044b;

    public g(k<T, V> kVar, e eVar) {
        this.f6043a = kVar;
        this.f6044b = eVar;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.f6044b + ", endState=" + this.f6043a + ')';
    }
}
