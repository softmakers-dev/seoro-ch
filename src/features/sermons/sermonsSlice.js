import {createSlice} from "@reduxjs/toolkit";

const initialState = [
]

function nextSermonId(sermons) {
    const maxId = sermons.reduce((maxId, sermon) => Math.max(sermon.id, maxId), -1)
    return maxId + 1
}

// export default function sermonsReducer(state= initialState, action) {
//
//     switch (action.type) {
//         case 'sermons/sermonAdded': {
//             return [
//                 ...state,
//                 {
//                     id: nextSermonId(state),
//                     link: action.payload.link,
//                     date: action.payload.date
//                 }
//             ]
//         }
//         default:
//             return state
//     }
// }

export const sermonsSlice = createSlice({

    name: 'sermons',
    initialState,
    reducers: {
        sermonAdded: (state, action) => {
            return [
                ...state,
                {
                    id: nextSermonId(state),
                    link: action.payload.link,
                    date: action.payload.date
                }
            ]
        },
        sermonDeleted: (state, action) => {
            return [
                ...state
            ]
        }
    }
})

export const {sermonAdded} = sermonsSlice.actions

export default sermonsSlice.reducer