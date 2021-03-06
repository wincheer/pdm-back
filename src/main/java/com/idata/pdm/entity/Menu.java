package com.idata.pdm.entity;

public class Menu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private Integer menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.parent_menu_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private Integer parentMenuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String menuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_uri
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String menuUri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_show_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String menuShowName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_id
     *
     * @return the value of menu.menu_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_id
     *
     * @param menuId the value for menu.menu_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.parent_menu_id
     *
     * @return the value of menu.parent_menu_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public Integer getParentMenuId() {
        return parentMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.parent_menu_id
     *
     * @param parentMenuId the value for menu.parent_menu_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_name
     *
     * @return the value of menu.menu_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_name
     *
     * @param menuName the value for menu.menu_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_uri
     *
     * @return the value of menu.menu_uri
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getMenuUri() {
        return menuUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_uri
     *
     * @param menuUri the value for menu.menu_uri
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setMenuUri(String menuUri) {
        this.menuUri = menuUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_show_name
     *
     * @return the value of menu.menu_show_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getMenuShowName() {
        return menuShowName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_show_name
     *
     * @param menuShowName the value for menu.menu_show_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setMenuShowName(String menuShowName) {
        this.menuShowName = menuShowName;
    }
}