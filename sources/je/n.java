package je;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class n {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static <T> void a(Appendable appendable, T t10, zd.l<? super T, ? extends CharSequence> lVar) {
        CharSequence charSequenceValueOf;
        ae.r.f(appendable, "<this>");
        if (lVar == null) {
            if (!(t10 == 0 ? true : t10 instanceof CharSequence)) {
                if (t10 instanceof Character) {
                    appendable.append(((Character) t10).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf((Object) t10);
            }
            appendable.append(charSequenceValueOf);
        }
        t10 = (T) lVar.invoke(t10);
        charSequenceValueOf = (CharSequence) t10;
        appendable.append(charSequenceValueOf);
    }
}
