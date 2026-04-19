package e2;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10464a;

    private a(AutofillId autofillId) {
        this.f10464a = autofillId;
    }

    public static a b(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.f10464a;
    }
}
