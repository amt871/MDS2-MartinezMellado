import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-vista_detalle__administrador_')
export class VistaVista_detalle__administrador_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-horizontal-layout style="height: 95%; width: 100%; flex-shrink: 1; flex-grow: 0; justify-content: center; align-items: center;">
  <vaadin-vertical-layout style="height: 95%; width: 60%; align-items: center; justify-content: center;">
   <vaadin-vertical-layout id="layoutVideo" style="width: 100%; height: 100%; align-items: center; justify-content: center;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="align-items: center; justify-content: flex-start; flex-grow: 1; flex-shrink: 1; height: 90%; width: 40%;">
   <img id="image" style="max-width: 30%; max-height: 30%;">
   <label id="labelUsuario">Usuario de la publicacion</label>
   <vaadin-horizontal-layout style="margin-top: var(--lumo-space-m); align-self: center; justify-content: space-around; width: 100%;">
    <vaadin-horizontal-layout style="width: 50%; align-self: center; align-items: center; justify-content: center;">
     <label id="labelUbi">Ubicacion</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="width: 50%; align-self: center; align-items: center; justify-content: center;">
     <label id="labelFecha">Fecha</label>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <label id="labelDescripcion">Label</label>
   <label style="margin-top: 5%;">Comentarios</label>
   <div style="width: 90%; height: 50%;">
    <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
   </div>
   <vaadin-horizontal-layout style="align-self: center; flex-grow: 0; flex-shrink: 1; justify-content: flex-start; align-items: flex-end; width: 100%; margin-top: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="flex-shrink: 1; flex-grow: 0; width: 30%; align-items: center; justify-content: center; align-self: flex-end;">
     <label style="align-self: center;" id="labelMeGustas">Me gustas </label>
     <iron-icon style="align-self: center; flex-grow: 0; flex-shrink: 1; width: 20%; height: 20%;" icon="vaadin:heart"></iron-icon>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing-s" style="align-items: center; justify-content: space-between; flex-shrink: 0; flex-grow: 1; margin-right: var(--lumo-space-xl);">
     <vaadin-button style="align-self: center;" id="bEliminar">
       Eliminar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
