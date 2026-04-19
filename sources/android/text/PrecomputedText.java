package android.text;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class PrecomputedText implements Spannable {

    public final /* synthetic */ class Params {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ int getBreakStrategy();

        public native /* synthetic */ int getHyphenationFrequency();

        public native /* synthetic */ TextDirectionHeuristic getTextDirection();

        public native /* synthetic */ TextPaint getTextPaint();
    }

    static {
        throw new NoClassDefFoundError();
    }

    @Override // android.text.Spanned
    public native /* synthetic */ <T> T[] getSpans(int i10, int i11, Class<T> cls);

    @Override // android.text.Spannable
    public native /* synthetic */ void removeSpan(Object obj);

    @Override // android.text.Spannable
    public native /* synthetic */ void setSpan(Object obj, int i10, int i11, int i12);
}
