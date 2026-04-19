package je;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final h e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new i(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new i(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ge.i g(MatchResult matchResult) {
        return ge.o.t(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ge.i h(MatchResult matchResult, int i10) {
        return ge.o.t(matchResult.start(i10), matchResult.end(i10));
    }
}
