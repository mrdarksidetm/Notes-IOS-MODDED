package rf;

/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19471b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f19470a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.f19471b != 0) {
            this.f19470a.append('\n');
        }
        this.f19470a.append(charSequence);
        this.f19471b++;
    }

    public String b() {
        return this.f19470a.toString();
    }
}
