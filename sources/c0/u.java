package c0;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final t a(double d10) {
        return d10 < 0.0d ? new t(0.0d, Math.sqrt(Math.abs(d10))) : new t(Math.sqrt(d10), 0.0d);
    }
}
