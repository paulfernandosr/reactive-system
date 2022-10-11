package pe.edu.unmsm.shipment;

public enum OrderStatus {
    SUCCESS,
    FAILURE,
    INITIATION_SUCCESS,
    RESERVE_INVENTORY,
    REVERT_INVENTORY,
    INVENTORY_SUCCESS,
    INVENTORY_FAILURE,
    INVENTORY_REVERT_SUCCESS,
    INVENTORY_REVERT_FAILURE,
    PREPARE_SHIPPING,
    SHIPPING_SUCCESS,
    SHIPPING_FAILURE
}
