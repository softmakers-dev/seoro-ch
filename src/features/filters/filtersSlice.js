import {createSlice} from "@reduxjs/toolkit";

const initialState = {
    fromDt: '2022-02-17',
    toDt: '2022-02-17'
}

// export default function filtersSlice(state= initialState, action) {
//
//     switch (action.type) {
//
//         case 'filters/changeDate': {
//             return {
//                 ...state,
//                 fromDt: action.payload.fromDt,
//                 toDt: action.payload.toDt
//             }
//
//         }
//         default:
//             return state
//     }
// }

export const filtersSlice = createSlice({

    name: 'filters',
    initialState,
    reducers: {
        changeDate: (state, action) => {
            return {
                ...state,
                fromDt: action.payload.fromDt,
                toDt: action.payload.toDt
            }
        }
    }
})

export const { changeDate } = filtersSlice.actions

export default filtersSlice.reducer
