package je;

/* JADX INFO: loaded from: classes2.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f14225a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f14226b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f14226b = new j("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private l() {
    }
}
