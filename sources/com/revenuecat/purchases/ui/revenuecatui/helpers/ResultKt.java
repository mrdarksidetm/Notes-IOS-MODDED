package com.revenuecat.purchases.ui.revenuecatui.helpers;

import a.a;
import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import md.i0;
import md.q;
import nd.u;
import nd.v;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ResultKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, F> List<F> collectErrors(List<? extends Result<? extends T, ? extends NonEmptyList<? extends F>>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Result result = (Result) it.next();
            Result.Error error = result instanceof Result.Error ? (Result.Error) result : null;
            NonEmptyList nonEmptyList = error != null ? (NonEmptyList) error.getValue() : null;
            if (nonEmptyList != null) {
                arrayList.add(nonEmptyList);
            }
        }
        return v.z(arrayList);
    }

    public static final /* synthetic */ Object errorOrNull(Result result) {
        r.f(result, "<this>");
        if (result instanceof Result.Success) {
            return null;
        }
        if (result instanceof Result.Error) {
            return ((Result.Error) result).getValue();
        }
        throw new q();
    }

    public static final /* synthetic */ <A extends R, B, R> R getOrElse(Result<? extends A, ? extends B> result, l<? super B, ? extends R> lVar) {
        r.f(result, "<this>");
        r.f(lVar, "onFailure");
        if (result instanceof Result.Success) {
            return (R) ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Error) {
            return lVar.invoke((Object) ((Result.Error) result).getValue());
        }
        throw new q();
    }

    public static final /* synthetic */ Object getOrNull(Result result) {
        r.f(result, "<this>");
        if (result instanceof Result.Success) {
            return ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Error) {
            return null;
        }
        throw new q();
    }

    public static final /* synthetic */ Object getOrThrow(Result result) throws Throwable {
        r.f(result, "<this>");
        if (result instanceof Result.Success) {
            return ((Result.Success) result).getValue();
        }
        if (!(result instanceof Result.Error)) {
            throw new q();
        }
        Result.Error error = (Result.Error) result;
        if (error.getValue() instanceof Throwable) {
            throw ((Throwable) error.getValue());
        }
        throw new IllegalStateException(("Result was unsuccessful: " + error.getValue()).toString());
    }

    public static final /* synthetic */ boolean isError(Result result) {
        r.f(result, "<this>");
        return result instanceof Result.Error;
    }

    public static final /* synthetic */ boolean isSuccess(Result result) {
        r.f(result, "<this>");
        return result instanceof Result.Success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <A, B, R> Result<R, B> map(Result<? extends A, ? extends B> result, l<? super A, ? extends R> lVar) {
        r.f(result, "<this>");
        r.f(lVar, "transform");
        if (result instanceof Result.Success) {
            return new Result.Success(lVar.invoke((Object) ((Result.Success) result).getValue()));
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <A, B, R> Result<A, R> mapError(Result<? extends A, ? extends B> result, l<? super B, ? extends R> lVar) {
        r.f(result, "<this>");
        r.f(lVar, "transform");
        if (result instanceof Result.Success) {
            return result;
        }
        if (result instanceof Result.Error) {
            return new Result.Error(lVar.invoke((Object) ((Result.Error) result).getValue()));
        }
        throw new q();
    }

    public static final /* synthetic */ <A, B, E> Result<List<B>, NonEmptyList<E>> mapOrAccumulate(Iterable<? extends Result<? extends A, ? extends NonEmptyList<? extends E>>> iterable, l<? super A, ? extends B> lVar) {
        r.f(iterable, "<this>");
        r.f(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Result<? extends A, ? extends NonEmptyList<? extends E>> result : iterable) {
            if (result instanceof Result.Success) {
                if (arrayList2.isEmpty()) {
                    arrayList.add(lVar.invoke((Object) ((Result.Success) result).getValue()));
                }
            } else if (result instanceof Result.Error) {
                arrayList2.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList2);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList);
    }

    public static final /* synthetic */ Result orSuccessfullyNull(Result result) {
        return result == null ? new Result.Success(null) : result;
    }

    public static final /* synthetic */ <A, B, C, D, E, F> Result<E, NonEmptyList<F>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends F>> result, Result<? extends B, ? extends NonEmptyList<? extends F>> result2, Result<? extends C, ? extends NonEmptyList<? extends F>> result3, Result<? extends D, ? extends NonEmptyList<? extends F>> result4, zd.r<? super A, ? super B, ? super C, ? super D, ? extends E> rVar) {
        r.f(result, "first");
        r.f(result2, "second");
        r.f(result3, "third");
        r.f(result4, "fourth");
        r.f(rVar, "transform");
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(u.p(result, result2, result3, result4)));
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(rVar.invoke((Object) ((Result.Success) result).getValue(), (Object) ((Result.Success) result2).getValue(), (Object) ((Result.Success) result3).getValue(), (Object) ((Result.Success) result4).getValue()));
    }

    public static final /* synthetic */ <A, B, C, E, F> Result<E, NonEmptyList<F>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends F>> result, Result<? extends B, ? extends NonEmptyList<? extends F>> result2, Result<? extends C, ? extends NonEmptyList<? extends F>> result3, zd.q<? super A, ? super B, ? super C, ? extends E> qVar) {
        r.f(result, "first");
        r.f(result2, "second");
        r.f(result3, "third");
        r.f(qVar, "transform");
        Result.Success success = new Result.Success(i0.f15558a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(u.p(result, result2, result3, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        a aVar = (Object) ((Result.Success) result).getValue();
        a aVar2 = (Object) ((Result.Success) result2).getValue();
        a aVar3 = (Object) ((Result.Success) result3).getValue();
        return new Result.Success(qVar.invoke(aVar, aVar2, aVar3));
    }

    public static final /* synthetic */ <A, B, E, F> Result<E, NonEmptyList<F>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends F>> result, Result<? extends B, ? extends NonEmptyList<? extends F>> result2, p<? super A, ? super B, ? extends E> pVar) {
        r.f(result, "first");
        r.f(result2, "second");
        r.f(pVar, "transform");
        i0 i0Var = i0.f15558a;
        Result.Success success = new Result.Success(i0Var);
        Result.Success success2 = new Result.Success(i0Var);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(u.p(result, result2, success, success2)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        a aVar = (Object) ((Result.Success) result).getValue();
        a aVar2 = (Object) ((Result.Success) result2).getValue();
        Object value = success.getValue();
        return new Result.Success(pVar.invoke(aVar, aVar2));
    }
}
