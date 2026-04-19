package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import le.a2;
import le.u0;
import le.x;
import le.z;

/* JADX INFO: loaded from: classes2.dex */
public final class zzas {
    public static final /* synthetic */ u0 zza(Task task) {
        final x xVarB = z.b(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                xVarB.a(exception);
            } else if (task.isCanceled()) {
                a2.a.b(xVarB, null, 1, null);
            } else {
                xVarB.L(task.getResult());
            }
        } else {
            task.addOnCompleteListener(zzo.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzaq
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    x xVar = xVarB;
                    Exception exception2 = task2.getException();
                    if (exception2 != null) {
                        xVar.a(exception2);
                    } else if (task2.isCanceled()) {
                        a2.a.b(xVar, null, 1, null);
                    } else {
                        xVar.L(task2.getResult());
                    }
                }
            });
        }
        return new zzar(xVarB);
    }
}
