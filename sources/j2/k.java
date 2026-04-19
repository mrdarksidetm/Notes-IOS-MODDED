package j2;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        md.s sVar;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int next = 0;
        lineInstance.setText(new d(charSequence, 0, charSequence.length()));
        PriorityQueue<md.s> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: j2.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.d((md.s) obj, (md.s) obj2);
            }
        });
        while (true) {
            int i10 = next;
            next = lineInstance.next();
            if (next == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                sVar = new md.s(Integer.valueOf(i10), Integer.valueOf(next));
            } else {
                md.s sVar2 = (md.s) priorityQueue.peek();
                if (sVar2 != null && ((Number) sVar2.d()).intValue() - ((Number) sVar2.c()).intValue() < next - i10) {
                    priorityQueue.poll();
                    sVar = new md.s(Integer.valueOf(i10), Integer.valueOf(next));
                }
            }
            priorityQueue.add(sVar);
        }
        float fMax = 0.0f;
        for (md.s sVar3 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) sVar3.a()).intValue(), ((Number) sVar3.b()).intValue(), textPaint));
        }
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(md.s sVar, md.s sVar2) {
        return (((Number) sVar.d()).intValue() - ((Number) sVar.c()).intValue()) - (((Number) sVar2.d()).intValue() - ((Number) sVar2.c()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (!(f10 == 0.0f)) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (o.a(spanned, l2.f.class) || o.a(spanned, l2.e.class)) {
                    return true;
                }
            }
            if (!(textPaint.getLetterSpacing() == 0.0f)) {
                return true;
            }
        }
        return false;
    }
}
