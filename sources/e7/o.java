package e7;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Integer num) {
        return (num != null && num.intValue() == 0) ? "unsupported" : (num != null && num.intValue() == 1) ? "inactive" : (num != null && num.intValue() == 2) ? "activating" : (num != null && num.intValue() == 3) ? "active" : (num != null && num.intValue() == 5) ? "active_per_user" : "";
    }
}
