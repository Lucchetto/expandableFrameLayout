package rjsv.expframelayout

import rjsv.expframelayout.enumerators.ExpandableFrameLayoutStatus

/**
 * @author [](mailto:rvfts@hotmail.com)
 * @version $Revision : 1 $
 */

interface ExpandableFrameLayoutListener {
    /**
     * Notifies the start of the animation.
     * Sync from android.animation.Animator.AnimatorListener.onAnimationStart(Animator animation)
     */
    fun onAnimationStart(status: ExpandableFrameLayoutStatus)

    /**
     * Notifies the end of the animation.
     * Sync from android.animation.Animator.AnimatorListener.onAnimationEnd(Animator animation)
     */
    fun onAnimationEnd(status: ExpandableFrameLayoutStatus)

    /**
     * Notifies the layout is going to open.
     */
    fun onPreOpen()

    /**
     * Notifies the layout is going to equal close size.
     */
    fun onPreClose()

    /**
     * Notifies the layout opened.
     */
    fun onOpened()

    /**
     * Notifies the layout size equal closed size.
     */
    fun onClosed()

}