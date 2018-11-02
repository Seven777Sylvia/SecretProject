package yooco.uchain.secretproject.base;

/**
 * @author : Seven
 * @date : 2018/10/31
 */
public interface BaseView<T> {
    /**
     * @param presenter :set presenter in the view
     */
    void setPresenter(T presenter);
}