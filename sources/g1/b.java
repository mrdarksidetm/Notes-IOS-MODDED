package g1;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f11259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f11260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AutofillManager f11261c;

    public b(View view, n nVar) {
        this.f11259a = view;
        this.f11260b = nVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f11261c = autofillManager;
        view.setImportantForAutofill(1);
    }

    public final AutofillManager a() {
        return this.f11261c;
    }

    public final n b() {
        return this.f11260b;
    }

    public final View c() {
        return this.f11259a;
    }
}
