import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';

@customElement('vista-video_otro_usuario__no_registrado__item')
export class VistaVideo_otro_usuario__no_registrado__item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; position: relative;">
 <vaadin-horizontal-layout style="width: 100%; height: 100%;">
  <vaadin-vertical-layout style="justify-content: center; align-items: center; width: 50%; height: 100%;">
   <vaadin-vertical-layout id="layoutVideo" style="max-width: 100%; max-height: 100%; align-items: center; justify-content: center;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; align-items: center; justify-content: center;">
   <img id="image" style="max-width: 30%; max-height: 30%;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center;">
    <label id="labelUsuario">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center;">
    <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; justify-content: center; align-items: center;">
     <label id="labelUbi">Label</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; align-items: center; flex-wrap: wrap;">
     <label id="labelFecha">Label</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 80%; align-items: center; justify-content: center;">
    <label id="labelDescripcion">Label</label>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center;">
    <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 50%; justify-content: center; align-items: center;">
     <vaadin-button theme="icon" aria-label="Add new" disabled>
      <iron-icon icon="vaadin:heart"></iron-icon>
     </vaadin-button>
     <label id="labelMeGustas">Label</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; align-items: center; justify-content: center;">
     <vaadin-button theme="icon" aria-label="Add new" id="bComentarios">
      <iron-icon icon="vaadin:comments"></iron-icon>
     </vaadin-button>
     <label id="labelComentarios">Label</label>
    </vaadin-vertical-layout>
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
