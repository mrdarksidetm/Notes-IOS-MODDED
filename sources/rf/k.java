package rf;

import java.util.regex.Pattern;
import uf.v;

/* JADX INFO: loaded from: classes2.dex */
public class k extends wf.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern[][] f19523e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uf.k f19524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f19525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private rf.a f19527d;

    public static class b extends wf.b {
        @Override // wf.e
        public wf.f a(wf.h hVar, wf.g gVar) {
            int iE = hVar.e();
            CharSequence charSequenceA = hVar.d().a();
            if (hVar.c() < 4 && charSequenceA.charAt(iE) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || (!(gVar.a().g() instanceof v) && !hVar.f().d())) {
                        Pattern pattern = k.f19523e[i10][0];
                        Pattern pattern2 = k.f19523e[i10][1];
                        if (pattern.matcher(charSequenceA.subSequence(iE, charSequenceA.length())).find()) {
                            return wf.f.d(new k(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return wf.f.c();
        }
    }

    private k(Pattern pattern) {
        this.f19524a = new uf.k();
        this.f19526c = false;
        this.f19527d = new rf.a();
        this.f19525b = pattern;
    }

    @Override // wf.a, wf.d
    public void b() {
        this.f19524a.o(this.f19527d.b());
        this.f19527d = null;
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        return this.f19526c ? wf.c.d() : (hVar.b() && this.f19525b == null) ? wf.c.d() : wf.c.b(hVar.getIndex());
    }

    @Override // wf.d
    public uf.a g() {
        return this.f19524a;
    }

    @Override // wf.a, wf.d
    public void i(vf.g gVar) {
        this.f19527d.a(gVar.a());
        Pattern pattern = this.f19525b;
        if (pattern == null || !pattern.matcher(gVar.a()).find()) {
            return;
        }
        this.f19526c = true;
    }
}
