package q2;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale f18968a;

    public a(Locale locale) {
        this.f18968a = locale;
    }

    @Override // q2.f
    public String a() {
        return this.f18968a.toLanguageTag();
    }

    public final Locale b() {
        return this.f18968a;
    }
}
