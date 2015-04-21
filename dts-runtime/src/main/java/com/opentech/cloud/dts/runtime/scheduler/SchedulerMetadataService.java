package com.opentech.cloud.dts.runtime.scheduler;

import com.opentech.cloud.dts.common.scheduler.Scheduler;

/**
 * Scheduler元数据服务
 * @author sihai
 *
 */
public interface SchedulerMetadataService {
	
	/**
	 * 订阅事件
	 * @param l
	 */
	void subscribe(Listener l);

	/**
	 * scheduler加入
	 * @param worker
	 */
	void join(Scheduler scheduler);
	
	/**
	 * scheduler离开
	 * @param worker
	 */
	void leave(Scheduler scheduler);
	
	/**
	 * 获取所有的scheduler
	 * @return
	 */
	Scheduler[] getAllScheduler();
	
	
	//=================================================================================
	//
	//=================================================================================
	/**
	 * 
	 * @author sihai
	 *
	 */
	class Event {
		
	}
	
	interface Listener {
		/**
		 * 
		 * @param event
		 */
		void fire(Event event);
	}
}
