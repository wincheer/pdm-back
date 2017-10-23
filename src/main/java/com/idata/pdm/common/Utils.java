package com.idata.pdm.common;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * <b>版权信息 :</b> 2017，广州智数技术有限公司<br/>
 * <b>功能描述 :</b> 辅助类<br/>
 * <b>版本历史 :</b> <br/>
 * 杨文清 | 2017年10月23日 下午7:29:37 | 创建
 */
public class Utils
{
	private static Logger log = Logger.getLogger(Utils.class);

	/**
	 * 将map中value等于空的key去掉
	 * @param map
	 */
	public static Map<String, Object> cleanMap(Map<String, Object> map)
	{
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
		for (String key : map.keySet())
		{
			log.info(key + " = " + map.get(key));
			if (map.get(key) != null && map.get(key).toString() != "")
			{
				resultMap.put(key, map.get(key));
			}
		}
		return resultMap;
	}

}
